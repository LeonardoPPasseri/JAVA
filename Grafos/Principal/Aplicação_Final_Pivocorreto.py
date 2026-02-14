import sys
import heapq
import time
import random
import networkx as nx
import osmnx as ox
import matplotlib.pyplot as plt
import warnings

warnings.filterwarnings("ignore")

def reconstruir_caminho(parents, start, end):
    path = []
    curr = end
    while curr != -1:
        path.append(curr)
        if curr == start:
            break
        curr = parents[curr]
    path.reverse()
    if not path or path[0] != start:
        return []
    return path

INT_MAX = sys.maxsize
def dijkstra_classico_metrics(graph_matrix, src, dest_target):
    V = len(graph_matrix)
    dist = [INT_MAX] * V
    parents = [-1] * V
    sptSet = [False] * V
    dist[src] = 0
    nodes_visited = 0

    for _ in range(V):
        min_val = INT_MAX
        min_index = -1
        
        for v in range(V):
            if not sptSet[v] and dist[v] <= min_val:
                min_val = dist[v]
                min_index = v
        
        if min_index == -1: 
            break
            
        u = min_index
        sptSet[u] = True
        nodes_visited += 1
        
        if u == dest_target:
            break

        for v in range(V):
            if (not sptSet[v] and graph_matrix[u][v] > 0 and 
                dist[u] != INT_MAX and dist[u] + graph_matrix[u][v] < dist[v]):
                dist[v] = dist[u] + graph_matrix[u][v]
                parents[v] = u 
                
    return dist[dest_target], parents, nodes_visited

INF = float('inf')

def dijkstra_pivo_faixa(graph_adj, source, dest_target, faixa=1000):
    n = len(graph_adj)
    dist = [INF] * n
    parents = [-1] * n
    dist[source] = 0
    
    heap = [(0, source)]
    nodes_visited = 0

    while heap:
        d_start, u_start = heap[0] 
        
        if d_start > dist[u_start]:
            heapq.heappop(heap)
            continue
            
        B = d_start + faixa
        
        faixa_vertices = []
        
        while heap:
            dv, v = heap[0]
            
            if dv >= B:
                break
                
            heapq.heappop(heap)
            
            if dv <= dist[v]:
                faixa_vertices.append((v, dv))
                nodes_visited += 1
        
        if not faixa_vertices:
            continue

        pivo_idx = len(faixa_vertices) // 2
        pivo_tupla = faixa_vertices[pivo_idx]
        
        outros_vertices = faixa_vertices[:pivo_idx] + faixa_vertices[pivo_idx+1:]
        ordem_processamento = [pivo_tupla] + outros_vertices
        
        for vtx, d_vtx in ordem_processamento:
            
            if vtx == dest_target:
                pass 

            for neigh, w in graph_adj[vtx]:
                nova_dist = d_vtx + w 
                
                if nova_dist < dist[neigh]:
                    dist[neigh] = nova_dist
                    parents[neigh] = vtx
                    heapq.heappush(heap, (nova_dist, neigh))
                    
        if dist[dest_target] != INF and heap and heap[0][0] > dist[dest_target]:
             break

    return dist[dest_target], parents, nodes_visited

def carregar_grafo(lugares):
    print(f"\nBaixando mapa de: {lugares}...")
    G = ox.graph_from_place(lugares, network_type='drive')
    
    try:
        if hasattr(ox, 'convert') and hasattr(ox.convert, 'to_undirected'):
            G = ox.convert.to_undirected(G)
        elif hasattr(ox, 'utils_graph') and hasattr(ox.utils_graph, 'get_undirected'):
            G = ox.utils_graph.get_undirected(G)
        else:
            G = G.to_undirected()
    except Exception as e:
        G = G.to_undirected()
    
    largest_cc = max(nx.connected_components(G), key=len)
    G = G.subgraph(largest_cc).copy()
    
    nodes = list(G.nodes())
    id_to_index = {node_id: i for i, node_id in enumerate(nodes)}
    index_to_id = {i: node_id for i, node_id in enumerate(nodes)}
    
    n = len(nodes)
    m = len(G.edges())
    print(f"Grafo Processado: {n} vértices | {m} arestas")
    
    return G, nodes, id_to_index, index_to_id

def converter_estruturas(G, n, id_to_index):
    lista_adj = [[] for _ in range(n)]
    usar_matriz = True
    
    matriz = []
    if usar_matriz:
        matriz = [[0.0] * n for _ in range(n)]

    for u, v, data in G.edges(data=True):
        idx_u = id_to_index[u]
        idx_v = id_to_index[v]
        peso = data.get('length', 1.0)

        lista_adj[idx_u].append((idx_v, peso))
        lista_adj[idx_v].append((idx_u, peso))
        
        if usar_matriz:
            matriz[idx_u][idx_v] = peso
            matriz[idx_v][idx_u] = peso
            
    return lista_adj, matriz, usar_matriz

def plotar_rota(G, path_indices, index_to_id, filename="rota_resultado.png"):
    if not path_indices:
        print("Aviso: Caminho vazio.")
        return
    path_osm_ids = [index_to_id[i] for i in path_indices]
    try:
        fig, ax = ox.plot_graph_route(G, path_osm_ids, route_color='blue', node_size=0, 
                                      route_linewidth=3, show=False, close=False)
        plt.title(f"Rota Calculada")
        plt.savefig(filename)
        plt.close()
    except Exception as e:
        print(f"Erro ao plotar: {e}")

def executar_testes():
    LUGARES = ["Copacabana, Rio de Janeiro, Brazil", "Ipanema, Rio de Janeiro, Brazil"]
    
    G, nodes, id_to_index, index_to_id = carregar_grafo(LUGARES)
    n = len(nodes)
    lista_adj, matriz, tem_matriz = converter_estruturas(G, n, id_to_index)
    
    NUM_TESTES = 5 
    print(f"\n Iniciando {NUM_TESTES} testes comparativos...")
    print(f"{'Iter':<5} | {'Algo':<10} | {'Tempo (ms)':<10} | {'Nós Visit.':<12} | {'Dist (m)':<10}")
    print("-" * 65)

    origem = random.randint(0, n-1)
    destino = random.randint(0, n-1)
    while origem == destino:
        destino = random.randint(0, n-1)
    
    print(f"Rota Sorteada (Índices): {origem} -> {destino}\n")
    
    caminho_final = []

    for i in range(NUM_TESTES):
        t1 = 0; v1 = 0; d1 = 0
        if tem_matriz:
            start = time.perf_counter()
            d1, p1, v1 = dijkstra_classico_metrics(matriz, origem, destino)
            end = time.perf_counter()
            t1 = (end - start) * 1000
            print(f"{i+1:<5} | {'Clássico':<10} | {t1:10.2f} | {v1:12d} | {d1:10.1f}")

        start = time.perf_counter()
        d2, p2, v2 = dijkstra_pivo_faixa(lista_adj, origem, destino, faixa=500) 
        end = time.perf_counter()
        t2 = (end - start) * 1000
        print(f"{i+1:<5} | {'Pivô':<10} | {t2:10.2f} | {v2:12d} | {d2:10.1f}")
        print("-" * 65)
        
        if i == NUM_TESTES - 1:
            caminho_final = reconstruir_caminho(p2, origem, destino)

    if caminho_final:
        plotar_rota(G, caminho_final, index_to_id, filename="rota_final_pivo.png")

if __name__ == "__main__":
    executar_testes()