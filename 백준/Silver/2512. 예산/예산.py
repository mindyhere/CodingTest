N = int(input()) #지방의 수
request = list(map(int, input().split())) # 각 요청예산
M = int(input()) #총 예산

minimum = 0
maximum = max(request)
answer = 0

def is_possible(max):
    tot = 0
    for r in request:
        tot += min(r, max)

    return tot <= M


while minimum <= maximum:
    mid = (minimum + maximum) // 2

    if is_possible(mid):
        minimum = mid + 1
        answer = mid
    else:
        maximum = mid -1
        
print(answer)