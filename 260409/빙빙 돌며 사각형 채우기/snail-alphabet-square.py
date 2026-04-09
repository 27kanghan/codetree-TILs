import sys
input = sys.stdin.readline

N, M = tuple(map(int, input().split()))

arr = [[0] * M for _ in range(N)]

def in_range(nr,nc) :
    return nr >= 0 and nc >= 0 and nr < N and nc < M and arr[nr][nc] == 0

dr = [0,1,0,-1]
dc = [1,0,-1,0]

r, c, d = 0,0,0

char_var = 'A'
cnt = 0

while (True) :
    arr[r][c] = char_var
    
    if cnt == N*M-1 :
        break;

    nr = r+dr[d%4]
    nc = c+dc[d%4]

    if not in_range(nr,nc) :
        d += 1
        continue
    cnt += 1
    if char_var == 'Z' :
        char_var = 'A'
    else : 
        char_var = chr(ord(char_var)+1)
    
    r,c = nr, nc

for i in range(N) :
    for j in range(M):
        print(arr[i][j], end=' ')
    print()
