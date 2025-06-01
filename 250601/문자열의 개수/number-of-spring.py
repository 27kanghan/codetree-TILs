li = list();

cnt = 1;
time = 0;
while True :
    str1 = input();

    if str1 == '0' :
        break;

    time += 1
    
    if cnt % 2 == 1 :
        li.append(str1);
    
    cnt += 1;

print(time);
for elem in li :
    print(elem)