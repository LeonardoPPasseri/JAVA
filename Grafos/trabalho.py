import collections
import heapq
import time
import matplotlib.pyplot as plt
import networkx as nx

class Grafo:
    def __init__(self, file_path):

        self.num_vertices = 0
        self.num_arestas = 0
        self.adj = None
        self.ponderado = False

        with open(file_path, 'r') as file:
            self.num_vertices = int(file.readline().strip())
            self.adj = {i: [] for i in range(1, self.num_vertices + 1)}

            current_pos = file.tell()
            first_line = file.readline().strip()

            if first_line:
                parts = first_line.split()
                if len(parts) == 3:
                    self.ponderado = True

            file.seek(current_pos)
            for line in file:
                parts = line.strip().split()

                if not parts:
                    continue

                u, v = int(parts[0]), int(parts[1])
                
                self.num_arestas += 1
                weight = float(parts[2]) if self.ponderado else 1.0

                self.adj[u].append((v, weight))
                self.adj[v].append((u, weight))
    
    def _get_caminho(self, pred, vertice_start, vertice_end):
        caminho = []
        current = vertice_end

        if pred.get(current) is None and current != vertice_start:
            return None
        
        while current is not None:
            caminho.append(current)

            if current == vertice_start:
                break

            current = pred.get(current)

        if not caminho or caminho[-1] != vertice_start:
            return None
        
        return caminho[::-1]

    def bfs(self, vertice_start):
        dist = {v: float('inf') for v in range(1, self.num_vertices + 1)}
        pred = {v: None for v in range(1, self.num_vertices + 1)}
        visitados = set()

        fila = collections.deque([vertice_start])
        dist[vertice_start] = 0

        while fila:
            u = fila.popleft()

            if u in visitados:
                continue

            visitados.add(u)

            for v, _ in self.adj.get(u, []):
                if dist[v] == float('inf'):
                    dist[v], pred[v] = dist[u] + 1, u
                    fila.append(v)

        return dist, pred, visitados

    def dfs(self, vertice_start):
        dist = {v: -1 for v in range(1, self.num_vertices + 1)}
        pred = {v: None for v in range(1, self.num_vertices + 1)}
        visitados = set()

        def dfs_recursiva(u, p, nivel):
            visitados.add(u)
            pred[u] = p
            dist[u] = nivel

            for v, _ in self.adj.get(u, []):
                if v not in visitados:
                    dfs_recursiva(v, u, nivel + 1)

        dfs_recursiva(vertice_start, None, 0)

        return dist, pred, visitados

    def dijkstra(self, vertice_start):
        dist = {v: float('inf') for v in range(1, self.num_vertices + 1)}
        pred = {v: None for v in range(1, self.num_vertices + 1)}
        visitados = set()

        dist[vertice_start] = 0.0
        fila = [(0.0, vertice_start)]

        while fila:
            distancia_u, u = heapq.heappop(fila)

            if u in visitados:
                continue

            visitados.add(u)

            if distancia_u > dist[u]:
                continue

            for v, weight in self.adj.get(u, []):
                if weight < 0.0:
                    raise ValueError("Peso negativo")
                
                if dist[u] + weight < dist[v]:
                    dist[v], pred[v] = dist[u] + weight, u
                    heapq.heappush(fila, (dist[v], v))

        return dist, pred, visitados

    def a_star(self, inicio, fim, heuristics_func):
        g_n = {v: float('inf') for v in range(1, self.num_vertices + 1)}
        pred = {v: None for v in range(1, self.num_vertices + 1)}
        visitados = set()

        g_n[inicio] = 0
        fila = [(heuristics_func(inicio), inicio)]

        while fila:
            _, u = heapq.heappop(fila)

            if u in visitados:
                continue

            visitados.add(u)

            if u == fim:
                break

            for v, weight in self.adj.get(u, []):
                if v in visitados:
                    continue

                novo_g_v = g_n[u] + weight

                if novo_g_v < g_n[v]:
                    pred[v], g_n[v] = u, novo_g_v
                    f_v = g_n[v] + heuristics_func(v)
                    heapq.heappush(fila, (f_v, v))

        return g_n, pred, visitados

    def comparar_algoritmos(self, inicio, fim, id_para_nome_map, heuristics_func):
        print(f"Comparando Algoritmos de '{id_para_nome_map[inicio]}' para '{id_para_nome_map[fim]}'")
        resultados = {}

        # BFS
        start_time = time.perf_counter()
        dist_bfs, pred_bfs, visitados_bfs = self.bfs(inicio)
        end_time = time.perf_counter()
        caminho_bfs = self._get_caminho(pred_bfs, inicio, fim)
        custo_bfs = 0
        
        if caminho_bfs:
            for i in range(len(caminho_bfs) - 1):
                u, v_node = caminho_bfs[i], caminho_bfs[i+1]
                for vizinho, peso in self.adj[u]:
                    if vizinho == v_node: 
                        custo_bfs += peso
                        break
        else:
            custo_bfs = float('inf')

        resultados['BFS'] = {
            "tempo": end_time - start_time, "custo": custo_bfs,
            "caminho": caminho_bfs, "visitados": len(visitados_bfs)
        }

        # DFS
        start_time = time.perf_counter()
        dist_dfs, pred_dfs, visitados_dfs = self.dfs(inicio)
        end_time = time.perf_counter()
        caminho_dfs = self._get_caminho(pred_dfs, inicio, fim)
        custo_dfs = 0

        if caminho_dfs:
            for i in range(len(caminho_dfs) - 1):
                u, v_node = caminho_dfs[i], caminho_dfs[i+1]
                for vizinho, peso in self.adj[u]:
                    if vizinho == v_node:
                        custo_dfs += peso
                        break
        else:
            custo_dfs = float('inf')

        resultados['DFS'] = {
            "tempo": end_time - start_time, "custo": custo_dfs,
            "caminho": caminho_dfs, "visitados": len(visitados_dfs)
        }

        # Dijkstra
        start_time = time.perf_counter()
        dist_dijkstra, pred_dijkstra, visitados_dijkstra = self.dijkstra(inicio)
        end_time = time.perf_counter()
        caminho_dijkstra = self._get_caminho(pred_dijkstra, inicio, fim)
        resultados['Dijkstra'] = {
            "tempo": end_time - start_time, "custo": dist_dijkstra.get(fim, float('inf')),
            "caminho": caminho_dijkstra, "visitados": len(visitados_dijkstra)
        }
        
        # A*
        start_time = time.perf_counter()
        dist_astar, pred_astar, visitados_astar = self.a_star(inicio, fim, heuristics_func)
        end_time = time.perf_counter()
        caminho_astar = self._get_caminho(pred_astar, inicio, fim)
        resultados['A*'] = {
            "tempo": end_time - start_time, "custo": dist_astar.get(fim, float('inf')),
            "caminho": caminho_astar, "visitados": len(visitados_astar)
        }
        
        print("-" * 100)
        print(f"{'Algoritmo':<20} | {'Tempo (ms)':<15} | {'Custo do Caminho':<20} | {'Nós Visitados':<15} | {'Caminho (Nós)':<15}")
        print("-" * 100)

        for nome, res in resultados.items():
            tempo_ms = res['tempo'] * 1000
            custo = f"{res['custo']:.2f}" if res['custo'] != float('inf') else "inf"
            nos_caminho = len(res['caminho']) if res['caminho'] else 0
            print(f"{nome:<20} | {tempo_ms:<15.5f} | {custo:<20} | {res['visitados']:<15} | {nos_caminho:<15}")

        print("-" * 100)

        return resultados

    def visualizar_caminho(self, id_para_nome_map, caminho_ids=None, title="Visualização"):
        G = nx.Graph()
        labels = {i + 1: id_para_nome_map[i + 1] for i in range(self.num_vertices)}
        G.add_nodes_from(labels.keys())
        
        edge_labels = {}
        for u, vizinhos in self.adj.items():
            for v, weight in vizinhos:
                if G.has_edge(u, v):
                    continue

                G.add_edge(u, v, weight=weight)

                if self.ponderado:
                    edge_labels[(u, v)] = f'{weight:.0f}'

        plt.figure(num=title, figsize=(16, 12))

        pos = nx.spring_layout(G, seed=42, k=1.5)
        
        node_colors = ['#cccccc'] * self.num_vertices
        edge_colors = ['#cccccc'] * G.number_of_edges()
        
        if caminho_ids:
            caminho_nodes = set(caminho_ids)
            caminho_edges = set(zip(caminho_ids, caminho_ids[1:]))
            
            nodes_list = list(G.nodes())
            node_colors = ['#1f78b4' if n in caminho_nodes else '#cccccc' for n in nodes_list]
            edge_colors = ['#1f78b4' if (u, v) in caminho_edges or (v, u) in caminho_edges else '#cccccc' for u, v in G.edges()]
            
            node_colors[nodes_list.index(caminho_ids[0])] = '#2ca02c'
            node_colors[nodes_list.index(caminho_ids[-1])] = '#d62728'

        nx.draw(G, pos, labels=labels, with_labels=True, node_color=node_colors, edge_color=edge_colors, 
                node_size=2000, font_size=10, font_color='black', width=2.0, node_shape='s')
        
        if self.ponderado:
            nx.draw_networkx_edge_labels(G, pos, edge_labels=edge_labels, font_color='navy')
            
        plt.title(title, size=10)
        plt.show()


# Exemplo de uso com o mapa da Romênia
if __name__ == "__main__":
    cidades = [
        "Arad", "Bucharest", "Craiova", "Dobreta", "Eforie", "Fagaras", "Giurgiu", 
        "Hirsova", "Iasi", "Lugoj", "Mehadia", "Neamt", "Oradea", "Pitesti", 
        "Rimnicu Vilcea", "Sibiu", "Timisoara", "Urziceni", "Vaslui", "Zerind"
    ]

    id_para_cidade = {i + 1: cidade for i, cidade in enumerate(cidades)}
    
    romania_graph_data = f"{len(cidades)}\n" + "\n".join([
        "13 20 71", "13 16 151", "20 1 75", "1 16 140",
        "1 17 118", "17 10 111", "10 11 70", "11 4 75",
        "4 3 120", "16 6 99", "16 15 80", "15 3 146",
        "15 14 97", "3 14 138", "6 2 211", "14 2 101",
        "2 7 90", "2 18 85", "18 8 98", "8 5 86",
        "18 19 142", "19 9 92", "9 12 87"
    ])
    with open("romania.txt", "w") as f:
        f.write(romania_graph_data)

    heuristics = [366, 0, 160, 242, 161, 178, 77, 151, 226, 244, 241, 234, 380, 98, 193, 253, 329, 80, 199, 374]

    def heuristica(u):
        return heuristics[u - 1]
        
    grafo = Grafo("romania.txt")
    vertice_inicio = 1
    vertice_fim = 2

    todos_os_resultados = grafo.comparar_algoritmos(
        vertice_inicio, vertice_fim,
        id_para_cidade,
        heuristics_func=heuristica
    )
    
    for nome_algoritmo, dados_resultado in todos_os_resultados.items():
        caminho_ids = dados_resultado['caminho']
        
        if caminho_ids:
            caminho_nomes = " -> ".join([id_para_cidade[id] for id in caminho_ids])
            print(f"\nVisualizando o caminho encontrado por: {nome_algoritmo}")
            print(f"Caminho: {caminho_nomes}")
            
            titulo_grafico = f"Caminho de Arad para Bucharest - '{nome_algoritmo}'"
            
            grafo.visualizar_caminho(id_para_cidade, caminho_ids, title=titulo_grafico)
        else:
            print(f"\nO algoritmo {nome_algoritmo} não encontrou um caminho.")