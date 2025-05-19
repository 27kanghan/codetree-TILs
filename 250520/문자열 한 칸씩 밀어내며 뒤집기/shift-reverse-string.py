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
        print("NAN")

    print(input_str);


    