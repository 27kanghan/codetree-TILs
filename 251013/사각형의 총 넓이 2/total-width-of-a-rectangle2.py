arr = [
    [0] * 200 for i in range (200)
]

N = int(input())

for i in range (N) :
    x1, y1, x2, y2 = tuple(map(int, input().split()))
    # x1, y1, x2, y2 = x1+100, y1+100, x2+100, y2+100;
    # print(x1, y1, x2, y2)

    for j in range (x1, x2) :
        for k in range (y1, y2) :
            arr[j][k] = 1;



cnt = 0;

for i in range (len(arr)) :
    for j in range (len(arr[0])):
        if arr[i][j] == 1 :
            cnt += 1 ;

print(cnt)
