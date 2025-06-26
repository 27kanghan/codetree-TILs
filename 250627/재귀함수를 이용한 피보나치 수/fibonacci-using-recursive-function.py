N = int(input())

# Please write your code here.

# 피보나치 수

def fibo(n) :

    if(n <= 2) :
        return 1
        
    
    return fibo(n-1) + fibo(n-2)


print(fibo(N))