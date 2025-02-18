arr = input().split();

n = len(arr);

sum_val = 0;

li = list();

for i in range (n-1) :
    num = int(arr[i]);
    if num >= 250 :
        break;
    li.append(arr[i]);

for i in range(0, len(li)) :
    sum_val += int(li[i])

print(f"{sum_val} {sum_val/len(li):.1f}")