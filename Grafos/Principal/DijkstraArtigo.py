import heapq

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
        pivo = faixa_vertices[pivo_idx]

        ordem_processamento = [pivo] + faixa_vertices[:pivo_idx] + faixa_vertices[pivo_idx+1:]

        for vtx, d_vtx in ordem_processamento:
            for neigh, w in graph_adj[vtx]:
                nova_dist = d_vtx + w
                if nova_dist < dist[neigh]:
                    dist[neigh] = nova_dist
                    parents[neigh] = vtx
                    heapq.heappush(heap, (nova_dist, neigh))

        if dist[dest_target] != INF and heap and heap[0][0] > dist[dest_target]:
            break

    return dist[dest_target], parents, nodes_visited
