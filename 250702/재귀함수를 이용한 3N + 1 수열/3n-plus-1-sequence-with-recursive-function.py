n = int(input())

# Please write your code here.

# N 이 짝수면 2로 나누고 N이 홀수면 3곱하고 1 더하기.

def method(n) :

    if(n == 1) :
        return 0;

    if (n % 2 == 0) :
        return method(n//2) + 1;
    else :
        return method(n*3+1) + 1;


print(method(n));
