import sys
input = sys.stdin.readline

N, M = tuple(map(int, input().split()))

arr = [[0] * M for _ in range(N)]

def in_range(nr,nc) :
    return nr >= 0 and nc >= 0 and nr < N and nc < M and arr[nr][nc] == 0

dr = [1,0,-1,0]
dc = [0,1,0,-1]
r,c,d = 0, 0, 0
cnt = 1;
while (cnt <= (N*M)) :
    arr[r][c] = cnt
    if cnt == N*M :
        break;
    
    nr = r+dr[d%4]
    nc = c+dc[d%4]

    if not in_range(nr,nc) :
        d += 1
        continue

    cnt += 1
    r = nr
    c = nc

    
for i in range(N) :
    for j in range(M):
        print(arr[i][j], end=' ')
    print()