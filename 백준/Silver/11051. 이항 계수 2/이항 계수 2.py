import sys
sys.setrecursionlimit(10**7)

input = sys.stdin.readline
N, K = map(int, input().split())

cache = [[0]*1001 for _ in range(1001)]

def fn(n, k):
    if cache[n][k]:
        return cache[n][k]
    
    if k==0 or k==n:
        cache[n][k] = 1
    else:
       cache[n][k] = fn(n-1, k-1)+fn(n-1,k)
    
    return cache[n][k]

print(fn(N, K) % 10007)