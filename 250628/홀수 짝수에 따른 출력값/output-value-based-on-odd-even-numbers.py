N = int(input())

# Please write your code here.



def odd_even(N) :
    # N이 홀수면 1부터 N까지 홀수, 짝수면 2부터 N까지 짝수 합 출력
    if (N <= 2) :
        return N;


    # if (N%2 == 0) :
    #     return N + odd_even(N-2)
    # else :
    #     return N + odd_even(N-2);

    return N + odd_even(N-2)

print(odd_even(N))
