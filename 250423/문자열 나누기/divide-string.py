num = int(input());

arr = input().split(" ");

string = ''

for i in range(0, len(arr)) :
    string += arr[i];

newstring = '';
cnt = 0;
for i in range(0, len(string)) :
    cnt+=1;

    print(string[i], end='');

    if cnt == 5 :
        print();
        cnt = 0;
    