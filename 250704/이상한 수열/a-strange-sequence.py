N = int(input())

# Please write your code here.

# 첫 번째 수는 1, 두 번째 수는 2
# N 번쨰는 N/3번째 수와 N-1번째수의 합


def get_num(N) :

    if N == 1 :
        return 1;
    if N == 2 :
        return 2;


    return get_num(N//3) + get_num(N-1)


print(get_num(N))