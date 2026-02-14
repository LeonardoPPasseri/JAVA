import sys

INT_MAX = sys.maxsize

def dijkstra(graph, src):
    V = len(graph)
    dist = [INT_MAX] * V
    sptSet = [False] * V

    dist[src] = 0

    for _ in range(V - 1):

        min_val = INT_MAX
        min_index = -1

        for v in range(V):
            if not sptSet[v] and dist[v] <= min_val:
                min_val = dist[v]
                min_index = v

        u = min_index
        sptSet[u] = True

        for v in range(V):
            if (not sptSet[v] and 
                graph[u][v] != 0 and 
                dist[u] != INT_MAX and 
                dist[u] + graph[u][v] < dist[v]):
                
                dist[v] = dist[u] + graph[u][v]

    for i in range(V):
        print(f"{i}\t\t{dist[i]}")
