import sys

input = sys.stdin.readline

N, T = tuple(map(int, input().split()))
R, C, D = input().split()

R, C = int(R) -1, int(C) -1


def inRange(nr, nc) :
    return nr >= 0 and nc >= 0 and nr < N and nc < N

def changeDirection(D) :
    if D == "U" :
        D = "D"
    elif D == "D" :
        D = "U"
    elif D == "R" :
        D = "L"
    else :
        D = "R"
    return D 

d = {}

d['U'] = 0
d['D'] = 1
d['R'] = 2
d['L'] = 3


dr = [1,-1,0,0]
dc = [0,0,1,-1]

# nr = 0
# nc = 0

for i in range(0, T) :
    nr = R + dr[d[D]]
    nc = C + dc[d[D]]

    if not inRange(nr,nc) :
        D = changeDirection(D)
        continue
    
    R = R + dr[d[D]]
    C = C + dc[d[D]]


print(R+1, C+1)
    
    



