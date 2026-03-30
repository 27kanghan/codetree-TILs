import sys
input = sys.stdin.readline

N = int(input())

D = {
    'W' : 0,
    'S' : 1,
    'N' : 2,
    'E' : 3,
    }

dr = [0,-1,1,0]
dc = [-1,0,0,1]
r,c = 0, 0

cnt = 0;

for i in range(N) :
    d, t = input().split()
    t = int(t);

    for j in range(t) :
        cnt += 1;
        r = r + dr[D[d]]
        c = c + dc[D[d]]

        if r == 0 and c == 0 :
            break;
    
    if r == 0 and c == 0 :
        break;
    
if r == 0 and c == 0 :
    print(cnt)
else :
    print(-1)




