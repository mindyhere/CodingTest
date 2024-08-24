from collections import deque

# 좌표이동
dy = (0, 1, 0, -1)
dx = (1, 0 , -1, 0)

N, M = map(int, input().split())
maze = [input() for _ in range(N)]

def is_valid_area(y, x):
    # 범위 내 유효한 좌표인지 검사
    return 0 <= y < N and 0 <= x < M

def bfs():
    visited = [[False]*M for _ in range(N)]
    visited[0][0]=True  

    dq = deque()
    dq.append((0,0, 1)) # y좌표, x좌표, 이동횟수

    while dq:
        y, x, count = dq.popleft()
        
        # 현재 위치가 도착점과 같을 때, 이동횟수 count를 리턴
        if y == N-1 and x == M-1:
            return count
        
        # 도착 전일 경우, 이동횟수 1 증가 & 다음 칸 이동
        count = count+1
        
        for k in  range(4):
            nextY = y + dy[k]
            nextX = x + dx[k]

            if is_valid_area(nextY, nextX) and maze[nextY][nextX]=='1' and not visited[nextY][nextX]:
                visited[nextY][nextX] = True # 방문한 좌표로 변경
                dq.append((nextY,nextX, count))

print(bfs())