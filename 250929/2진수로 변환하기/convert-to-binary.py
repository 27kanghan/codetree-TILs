num = int(input())



digit = []

while True : 

    digit.append(num % 2)

    if num // 2 == 0 :
        break;


    num //= 2;


for digi in digit [::-1] :
    print(digi, end = "")