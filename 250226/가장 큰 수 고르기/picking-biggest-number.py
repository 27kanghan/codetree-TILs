arr = list(map(int, input().split()));

max_value = 0;

for i in arr :
    max_value = max(i,max_value);

print(max_value);
