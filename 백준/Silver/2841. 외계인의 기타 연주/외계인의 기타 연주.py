import sys

input = sys.stdin.readline

N, P = map(int, input().split())
stk = [[] for _ in range(6)]
cnt = 0

for _ in range(N):
    l, p = map(int, input().split())

    while stk[l-1] and stk[l-1][-1] > p:
        stk[l-1].pop()
        cnt += 1

    if stk[l-1] and stk[l-1][-1] == p:
        continue 
    
    stk[l-1].append(p)
    cnt += 1

print(cnt)