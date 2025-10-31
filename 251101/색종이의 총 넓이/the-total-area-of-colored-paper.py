offset = 200;

arr = [
    [0] * offset for i in range (offset)
]

n = int(input())

# 가로 세로 넓이가 8임.

for i in range (0, n) :
    x, y = tuple(map(int, input().split()))
    x += (offset // 2)
    y += (offset // 2)

    for j in range (x, x+8) :
        for k in range (y, y+8) :
            arr[j][k] = 1;


answer = 0;

for i in range (0, offset) :
    for j in range (0, offset) :
        if arr[i][j] == 1 :
            answer += 1;

print(answer)