N = int(input())

# Please write your code here.

# 팩토리얼로 N!값 구하자.

def get_factorial (N) : 
    # N * N-1

    if (N == 1) :
        return 1;

    return N * get_factorial(N-1);


print(get_factorial(N))