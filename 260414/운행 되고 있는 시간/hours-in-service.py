import sys
input = sys.stdin.readline

N = int(input())

points = [tuple(map(int, input().split())) for _ in range(N)]

max_time = -1


answer = 0

for i in range(N) :
    arr = [0] * 1001
    sum = 0
    for j, (x,y) in enumerate(points) :
        if i == j :
            continue
        for k in range(x,y) :
            arr[k] = 1
    for j in range(0, len(arr)) :
        if arr[j] == 1 :
            sum += 1

    answer = max(answer, sum)


print(answer)