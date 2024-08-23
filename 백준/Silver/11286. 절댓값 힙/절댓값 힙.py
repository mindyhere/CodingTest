# 우선순위 큐 활용, python min-heap
import sys
import heapq as hq
 
input = sys.stdin.readline #빠른 입출력을 위해
pq = [] # 우선순위 큐 활용, (절댓값, 원본데이터) 튜플로 저장

for _ in range(int(input())):
    x = int(input())

    if x != 0 :
        hq.heappush(pq,(abs(x),x))
    else :
        # 문자열, 리스트, 튜플, 딕셔너리 등의 값이 비어 있으면("", [], (), {}) 거짓 / 비어 있지 않으면 참
        if pq :
            print(hq.heappop(pq)[1])  
        else : 
            print(0)
