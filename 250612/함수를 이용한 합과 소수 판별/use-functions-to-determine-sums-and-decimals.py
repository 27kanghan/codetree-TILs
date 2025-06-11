a, b = map(int, input().split())

# Please write your code here.

# A와 B 이하 수 중, 소수 AND 자리수 합이 짝수 인 수의 개수 구하기.
# 소수인 수 중에서 -> 자리수의 합이 짝수인거 구하자.


def is_even(num) :

    if (num // 10 + num % 10) % 2 == 0 :
        return True 

    return False;

def is_prime (num) :
    
    for i in range (2, num) :
        if num % i == 0 :
            return False;
    
    return is_even(num)

cnt = 0;

for i in range(a, b+1) :
    if is_prime(i) :
        cnt+=1;


print(cnt);