import sys
input = sys.stdin.readline

N = int(input())
mirror_map = [input() for _ in range(N)] 
K = int(input())

dr = [1, 0, -1, 0]
dc = [0, -1, 0, 1]

def init(start_num):
    num = start_num - 1
    group = num // N
    idx = num % N
    
    if group == 0:     
        return 0, idx, 0
    elif group == 1:   #
        return idx, N - 1, 1
    elif group == 2: 
        return N - 1, N - 1 - idx, 2
    else:             
        return N - 1 - idx, 0, 3

def change_direction(dir, mirror):
    if mirror == '/':
        if dir == 0: return 1
        elif dir == 1: return 0
        elif dir == 2: return 3
        elif dir == 3: return 2
    else: # mirror == '\'
        if dir == 0: return 3
        elif dir == 1: return 2
        elif dir == 2: return 1
        elif dir == 3: return 0

def in_range(nr, nc):
    return 0 <= nr < N and 0 <= nc < N
    
r, c, d = init(K)
cnt = 0 

while True:
    cnt += 1 

    d = change_direction(d, mirror_map[r][c])


    nr = r + dr[d]
    nc = c + dc[d]


    if not in_range(nr, nc):
        break

    r = nr
    c = nc

print(cnt)