N, B = tuple(map(int, input().split()))

num = []

while True :

    num.append( N % B)

    if N // B == 0 : break;

    N = N // B;


for i in num[::-1] :
    print(i, end = "") 