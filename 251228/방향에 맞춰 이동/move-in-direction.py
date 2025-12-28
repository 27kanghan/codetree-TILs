import sys
input = sys.stdin.readline


def decide_direction(dr) :
    if dr == "E" :
        return 0
    elif dr == "W" :
        return 1 
    elif dr == "S" :
        return 2
    else :
        return 3

N = int(input())
x, y = 0, 0

dx = [1,-1, 0, 0]
dy = [0,0, -1, 1]

for i in range (0, N) :
    dr, ds = input().split();
    ds = int(ds)

    d = decide_direction(dr)

    x += dx[d] * ds 
    y += dy[d] * ds     


print(x, y)

