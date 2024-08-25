import sys

input = sys.stdin.readline

arr = []
cnt = 0

while 1:
    cnt +=  1 

    L, P, V = map(int, input().split())

    if (L, P, V) == (0, 0, 0):
        break

    res = (V // P) * L + min(L, V % P)
    print(f"Case {cnt}: {res}")