import sys
input = sys.stdin.readline

N = int(input())
card = set(map(int, input().split()))
M = int(input())
num = list(map(int, input().split()))

for i in num:
    if i in card:
        print(1, end=" ")
    else:
        print(0, end=" ")
