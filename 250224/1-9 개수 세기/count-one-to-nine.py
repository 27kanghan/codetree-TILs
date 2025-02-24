n = int(input());

arr = list(map(int, input().split()));

li = [0] * 9;

for i in arr :
    li[i-1] += 1;

for eli in li :
    print(eli);