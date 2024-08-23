# 자료구조 - 큐 활용
import sys
from collections import deque


N = int(sys.stdin.readline())

d = deque()
for i in range(1, N+1):
    d.append(i)

while len(d) > 1:
    d.popleft() # 맨 앞의 수를 삭제하고
    d.append(d.popleft()) # 그다음 수를 삭제하고 큐의 맨 뒤에 삽입

print(d[0])