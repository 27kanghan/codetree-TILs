string = input();

arr = list(string);

leng = len(string);

while leng > 1:
    num = int(input());

    if num >= leng :
        num = leng - 1;

    arr.pop(num);
    leng -= 1;

    string = ''.join(arr);

    print(string);

    