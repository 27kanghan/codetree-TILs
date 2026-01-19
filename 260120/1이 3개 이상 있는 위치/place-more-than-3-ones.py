import sys

input = sys.stdin.readline

N = int(input());

board = [list(map(int, input().split())) for _ in range(N)]

dxs, dys = [0, 1, 0, -1], [1, 0, -1 ,0]

answer = 0;

def in_range(x, y):
    return x >= 0 and x < N and y >= 0 and y < N

def valid(x,y):
    cnt = 0;
    for dx, dy in zip(dxs, dys) :
        nx, ny = x + dx, y + dy

        if in_range(nx, ny) and board[nx][ny] == 1 :
            cnt+=1;

    return cnt;

for i in range (N) :
    for j in range(N) :
        if valid (i, j) >= 3 :
            answer += 1;

print(answer)