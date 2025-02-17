# 4로 나누어 떨어지는 해
# 100으로 나누어떨어지되 400으로 나누어 떨어지지 않으면 평년

year = int(input());

cnt = 0;

n = 1;

for _ in range(n, year+1) :
    if n % 100 == 0 and n % 400 != 0 :
        n+=1;
        continue;
    if n % 4 == 0 :
        cnt+=1;
    n += 1 


print(cnt);


