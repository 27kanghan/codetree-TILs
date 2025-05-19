s= input();

leng = len(s);

print(s);
for i in range(0, leng) :
    s = s[-1:] + s[:-1];
    print(s);
