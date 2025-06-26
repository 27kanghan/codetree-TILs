import math;

N = int(input())

# Please write your code here.

# 각 자리 수의 제곱을 반환하라.
# 크게보면 an = (a%10) ^ 2 + (a % 10) ^ 2 하면 됨

def pow_num(N) :
    if N < 10 :
        return pow(N,2);


    return pow_num(N//10) + pow(N % 10, 2);


print(pow_num(N));