n = int(input())

arr_2d = [
    [0 for _ in range(n)]

    for _ in range(n)
]

for i in range (6) :
    arr_2d[i][0] = 1
    arr_2d[i][i] = 1


cnt = 1;
for i in range (1, 6) :
    for j in range (1, cnt) :
        arr_2d[i][j] = arr_2d[i-1][j-1] + arr_2d[i-1][j];
    cnt+=1

for a in arr_2d :
    for elem in a:
        if elem != 0 :
            print(elem, end = ' ')
    print();

