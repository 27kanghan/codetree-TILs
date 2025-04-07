n = int(input());


lensum = 0;
cnt = 0;

for i in range(n) :
    word = input();
    lensum += len(word);
    if(word[0] == 'a') :
        cnt+=1;
print(lensum, cnt);