n, m = (map(int, input().split()));

arr_2d = [
    [0 for _ in range (m)]

    for _ in range (n)
]

num = 1;

# 가로 먼저 채우기

for start_col in range (m) :
    curr_row = 0;
    curr_col = start_col;

    while 0 <= curr_col and curr_row < n:

        arr_2d[curr_row][curr_col] = num;

        
        curr_col -= 1;
        curr_row += 1;
        num += 1;



#세로 채우기
for start in range (1, n) :
    curr_row = start;
    curr_col = m-1;

    while 0 <= curr_col and curr_row < n:
        arr_2d[curr_row][curr_col] = num;

        num += 1;
        curr_col -= 1;
        curr_row += 1;

for i in arr_2d :
    for elem in i:
        print(elem, end=' ')
    print();