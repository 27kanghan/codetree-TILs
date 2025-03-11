arr = list(map(int, input().split()))

n = arr[0];
m = arr[1];

new_arr = [
    [0 for _ in range (m)]
    for _ in range (n)
]

cnt = 1;
for i in range (n) :
    for j in range (m) :
        new_arr[i][j] = cnt;
        cnt+=1

for i in range (n) :
    for j in range (m) :
        print(new_arr[i][j], end = ' ');
    print();