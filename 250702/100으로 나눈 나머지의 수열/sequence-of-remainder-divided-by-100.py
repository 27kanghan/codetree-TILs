N = int(input())

# Please write your code here.

# a1 = 2 a2 = 4  a3 = (a1 * a2) % 100

def get_num(N) :

    # print(N)

    if (N == 1) :
        return 2;

    if (N == 2) : 
        return 4;

    return ((get_num(N-1) * get_num(N-2)) % 100)

print(get_num(N))