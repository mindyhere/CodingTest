import sys
from collections import deque

input = sys.stdin.readline


def bfs(graph, start):
    n = [0] * (N+1)
    visited = [] # 이미 탐색한 사람인지 체크하기 위한 배열
    visited.append(start)

    dq = deque()
    dq.append(start)

    while dq:
        now = dq.popleft()
        
        for nxt in graph[now]:
            if nxt not in visited:
                visited.append(nxt)
                n[nxt] = n[now]+ 1
                dq.append((nxt))
    
    return sum(n)

if __name__ == "__main__":
    N, M = map(int, input().split())
    graph = [[] for _ in range(N+1)]

    for _ in range(M):
        # 입력받은 수로 그래프 표현
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)

    kevin = []
    for i in range(1, N+1):
        kevin.append(bfs(graph, i))

    result = kevin.index(min(kevin)) + 1    

    print(result)