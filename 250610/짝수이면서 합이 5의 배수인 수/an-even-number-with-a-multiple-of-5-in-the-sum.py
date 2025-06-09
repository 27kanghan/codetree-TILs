n = int(input())

# Please write your code here.

# 짝수이면서 합이 5의 배수여야함
def valid(n) :

    return (n / 10 + n % 10 ) % 5


flag = valid(n);

if flag :
    print("Yes")
else :
    print("No")