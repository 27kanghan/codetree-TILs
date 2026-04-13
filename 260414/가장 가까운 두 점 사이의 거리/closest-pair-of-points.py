import sys
input = sys.stdin.readline

N = int(input())
points = [tuple(map(int, input().split())) for _ in range(N)]

INT_MAX = sys.maxsize

answer = INT_MAX
# min_x, max_x = INT_MAX, 1;
# min_y, max_y = INT_MAX, 1


for i in range (N) :
    x1, y1 = points[i]
    for j in range(i+1, N) :
        
        x2, y2 = points[j]
        answer = min(answer, (x2-x1) * (x2-x1) + (y2-y1) * (y2-y1))
        
        

print(answer)
