arr = list(map(int,input().split()));

sum_val = 0;
third = 0;
cnt = 0;
count = 0;

for i in range (0,10) :
    count+=1;
    if(i % 2 != 0) :
        sum_val += arr[i];
    if(count % 3 == 0) :
        third += arr[i];
        cnt += 1;

# sum_val = sum(oarr);

print(f"{sum_val} {third/cnt:.1f}");