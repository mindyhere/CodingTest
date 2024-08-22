# 수열 개수 N, 참조할 수 X를 입력받음
N, X = map(int, input().split())

# 수열 입력받아 배열로 저장
arr = list(map(int, input().split()))

# 반복문으로 X와 같은 수를 찾아 한줄에 출력
for i in arr:
    if i < X:
        print(i, end=" ")
