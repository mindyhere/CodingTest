import sys, random
from itertools import combinations


height = []
answer = []

# 아홉 개의 수(키)를 입력받아 저장
for _ in range(9):
    height.append(int(sys.stdin.readline()))

for i in combinations(height, 7):
    # 합이 100인 조합을 찾아 리스트에 저장
    if sum(i)==100:
        answer.append(sorted(i))

for j in random.choice(answer):
    print(j)