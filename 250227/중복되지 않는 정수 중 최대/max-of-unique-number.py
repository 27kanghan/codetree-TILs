n = int(input());

arr = list(map(int, input().split()));

li = [0] * 1000;

for i in arr :
    li[i] += 1;

max_value = -1;

for i in range(999, 0, -1) :
    if li[i] == 1 :
        max_value = max(max_value, i);


print(max_value);
