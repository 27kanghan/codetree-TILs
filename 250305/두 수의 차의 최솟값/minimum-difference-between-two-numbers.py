n = int(input());

arr = list(map(int, input().split()));

min_val = 9999999;

up = 0;
down = 0;


for a in arr :
    for b in arr :
        if a == b :
            continue;
        min_val = min(min_val, abs(a-b));

print(min_val);

        
