n = int(input())

# Please write your code here.

def make_star (n) :

    if n == 0 :
        return

    make_star(n-1);
    print("*" * n)

make_star(n);