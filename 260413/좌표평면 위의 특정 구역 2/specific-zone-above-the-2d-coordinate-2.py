import sys
input = sys.stdin.readline

N = int(input())

INT_MAX = sys.maxsize

points = [tuple(map(int, input().split())) for _ in range(N)]

ans = INT_MAX

for i in range(0, N) :
    min_x, max_x = INT_MAX, 1
    min_y, max_y = INT_MAX, 1
    for j, (x,y) in enumerate(points) :
        if i==j :
            continue
        
        min_x = min(min_x, x)
        max_x = max(max_x, x)
        min_y = min(min_y, y)
        max_y = max(max_y, y)

    ans = min(ans, (max_x - min_x) * (max_y-min_y))

print(ans)

