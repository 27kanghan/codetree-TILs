day = int(input());

n = 1;
cl = 0;
co = 0;
re = 0;



for i in range (1, day+1) :
    if i % 12 == 0 :
        re += 1;
    elif i % 3 == 0 :
        co += 1;
    elif i % 2 == 0:
        cl += 1;

print(cl, co, re)
