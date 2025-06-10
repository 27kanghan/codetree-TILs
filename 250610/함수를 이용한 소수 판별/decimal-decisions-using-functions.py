a, b = map(int, input().split())

# Please write your code here.

def is_prime(num) :
    for i in range(2, num) :
        if num % i == 0 :
            return False;

    return True;


def sum_val(a, b) :

    sum_val1 = 0;
    for i in range(a, b+1):
        if is_prime(i) :
            sum_val1 += i;
    
    return sum_val1;

print(sum_val(a,b))