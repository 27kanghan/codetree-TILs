input_str, q = input().split()
q = int(q)


leng = len(input_str);



for i in range(0, q) :
    num = int(input());

    # 1이면 가장 앞에있는 문자를 맨 뒤로
    if num == 1 :
        input_str = input_str[1:] + input_str[0]

    # 2면 맨 뒤를 앞으로    
    elif num == 2 :
        input_str = input_str[-1] + input_str[:-1]

    # 3이면 좌우 반전.
    elif num == 3 :
        arr = list(input_str);

        for j in range(0, leng) :
            arr[j] = input_str[leng-j-1];

        input_str = ''.join(arr); 

    print(input_str);


    