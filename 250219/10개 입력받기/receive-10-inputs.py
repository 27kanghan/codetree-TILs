arr = list(map(int, input().split()));

cnt = 0;

# 0 개수 찾기

for en in arr :
    if en == 0 :
        break;
    cnt += 1;

sum_val = 0;

for i in range (0, cnt) :
    sum_val += arr[i];


print(f"{sum_val} {sum_val/cnt:.1f}");