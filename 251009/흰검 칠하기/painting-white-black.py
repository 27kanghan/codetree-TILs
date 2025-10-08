n = int(input());

arr = [0] * 2001
arr_w = [0] * 2001
arr_b = [0] * 2001

cur_x = 1000;
w = 0;
b = 0;
g = 0;

for i in range (n) :
    cnt, direction = input().split();

    cnt = int(cnt);
    if direction == 'R' :
        for j in range(cur_x, cur_x+cnt) :
            arr[j] = 1;
            arr_b[j] += 1;
        cur_x += (cnt-1)
    else :
        for j in range(cur_x, cur_x-cnt,-1) :
            arr[j] = 2;
            arr_w[j] += 1;
        cur_x -= (cnt-1)


for i in range(0, len(arr)) :
    if arr_w[i] >= 2 and arr_b[i] >= 2:
        g += 1;
    elif arr[i] == 1 :
        b += 1
    elif arr[i] == 2 :
        w += 1



print(w, b, g)