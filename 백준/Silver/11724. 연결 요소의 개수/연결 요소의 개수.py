import sys

sys.setrecursionlimit(100000)
N, M = map(int, input().split())

input = sys.stdin.readline
# 그래프를 표현하기 위해 인접행렬 선언& 초기화
adj = [[0]*N for _ in range(N)]

for _ in range(M):
    a, b = map(int, input().split())
    adj[a-1][b-1] = adj[b-1][a-1] = 1

check = [False]*N # 방문여부 검사를 위한 변수
count = 0 # 연결요소 개수를 세기 위해 변수 선언

# DFS(깊이우선탐색법) 함수선언
def dfs(now):
    for nextNode in range(N):
        if adj[now][nextNode] and not check[nextNode]:
            check[nextNode] = True
            dfs(nextNode)

for i in range(N):
    if not check[i]:
        count += 1
        check[i] = True
        dfs(i)

print(count)