N = int(input())
arr = list(map(int,input().split()));

cnt = 0;
sum_val = 0;

new_arr = [];
for i in range(0, len(arr)) :
    cnt = cnt + 1;

    new_arr.append(arr[i]);

    new_arr = sorted(new_arr)

    if cnt % 2 != 0 :
        print(new_arr[len(new_arr)//2], end=' ')

    