arr = [
    [0] * 100 for i in range (100)
]

N = int(input())

for i in range (N) :
    x1, y1, x2, y2 = tuple(map(int, input().split()))
    for j in range (x1, x2) :
        for k in range (y1, y2) :
            arr[j][k] = 1;



cnt = 0;

for i in range (len(arr)) :
    for j in range (len(arr[0])):
        if arr[i][j] == 1 :
            cnt += 1 ;

print(cnt)
