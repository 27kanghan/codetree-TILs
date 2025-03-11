arr = list(map(int, input().split()))

m = arr[0];
n = arr[1];

new_arr = [
    [0 for _ in range (m+1)]
    for _ in range (n+1)
]

cnt = 1;
for i in range (m) :
    for j in range (n) :
        new_arr[i][j] = cnt;
        cnt+=1

for i in range (m) :
    for j in range (n) :
        print(new_arr[i][j], end = ' ');
    print();