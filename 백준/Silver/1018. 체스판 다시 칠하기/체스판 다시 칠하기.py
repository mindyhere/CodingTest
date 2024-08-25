import sys

input = sys.stdin.readline

N,M = map(int, input().split())
board = [input() for _ in range(N)]
answer = []

# (x, y) - 8*8 좌측 최상단 시작점
def fn(x, y, color):
    cnt = 0
    # (i, j) - x축, y축 방향 이동할 개수
    for i in range(8):
        for j in range(8):
            if (i+j) % 2:
                # 시작 컬러와 같으면 채색횟수 up
                if board[x+i][y+j] == color:
                    cnt += 1
            else:
                # 시작 컬러와 다르면 채색횟수 up
                if board[x+i][y+j] != color:
                    cnt += 1
    answer.append(cnt)

for i in range(N-7):
    for j in range(M-7):
        fn(i, j, "B") # B로 시작하는 체스판 만들 때
        fn(i, j, "W") # W로 시작하는 체스판 만들 때

# 최솟값 출력
print(min(answer))