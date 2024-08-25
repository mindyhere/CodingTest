import sys

sys.setrecursionlimit(10000**2)
input = sys.stdin.readline

n, m = map(int, input().split())
board = [list(map(int, list(input().rstrip()))) for _ in range(n)]
table = [[0]*m for _ in range(n)]
answer = 0

for i in range(n):
    for j in range(m):
        if i == 0 or j == 0:
            table[i][j] = board[i][j]
        elif board[i][j] > 0:
            table[i][j] = min(table[i-1][j], table[i][j-1], table[i-1][j-1]) + 1

        answer = max(answer, table[i][j])

print(answer**2)