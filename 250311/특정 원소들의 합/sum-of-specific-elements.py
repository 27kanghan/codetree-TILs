arr_2d = [
    list(map(int, input().split()))

    for _ in range(4)
]

# 0 0, 1 0 , 1 1
# cnt = 0 해서 ~ 까지 하면 된다.

cnt = 1;
sum_val = 0;

for i in range (4) :
    for j in range (0, cnt) :
        sum_val += arr_2d[i][j];
    cnt+=1;
print(sum_val);