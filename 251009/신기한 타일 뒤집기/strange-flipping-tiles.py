n = int(input())

max_k = 100000;

arr = [0] * (2 * max_k + 1)

w = 0;
b = 0;


cur_x = max_k
for i in range(n) :
    x, direction = input().split()
    x = int(x)

    if direction == "R" :
        for j in range(cur_x, cur_x + x) :
            arr[j] = 1;
        cur_x = cur_x+x-1
    
    else :
        for j in range (cur_x, cur_x - x, -1) :
            arr[j] = 2;
        cur_x = cur_x - (x - 1);


for i in range(0, len(arr)) :
    if arr[i] == 1 :
        b +=1;
    elif arr[i] == 2:
        w += 1;

print(w,b)