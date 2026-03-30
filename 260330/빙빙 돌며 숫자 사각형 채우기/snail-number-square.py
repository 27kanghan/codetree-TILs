import sys
input = sys.stdin.readline

N, M = tuple(map(int, input().split()))

arr = [[0] * M for _ in range(N)]

def inRange(nr, nc) :
    return nr >= 0 and nc >= 0 and nr < N and nc < M and arr[nr][nc] == 0


cnt = 1

r, c = 0,0
d = 0;


# 순서 오, 아, 왼, 위
dr = [0, 1, 0, -1]
dc = [1, 0, -1, 0]

arr[0][0] = cnt


while cnt < N * M :

    nr = r + dr[d % 4]
    nc = c + dc[d % 4]

    if not inRange(nr,nc) :
        d += 1
        continue
        
    cnt += 1
    r = r + dr[d % 4]
    c = c + dc[d % 4]
    arr[r][c] = cnt;
    

for i in range(N) :
    for j in range(M) :
        print(arr[i][j], end=" ")
    print()