while True :
    str1 = input();

    if str1 == 'END' :
        break;

    arr = list(str1);

    for i in range (len(str1)-1, -1, -1) :
        print(arr[i], end='')
    print()

