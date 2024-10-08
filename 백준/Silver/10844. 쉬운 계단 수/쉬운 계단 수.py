import sys
input = sys.stdin.readline
 
MOD = 10**9

cache = [[0]*10 for _ in range(101)]

for i in range(1, 10):
    cache[1][i] = 1
    
for i in range(2, 101):
    for j in range(10):
        if j == 0:
            cache[i][j] += cache[i-1][1]
        elif j == 9:
            cache[i][j] += cache[i-1][8]
        else:
            cache[i][j] = cache[i-1][j-1] + cache[i-1][j+1] 

N = int(input())
answer = 0

for i in range(10):
    answer += cache[N][i]

print(answer % MOD)