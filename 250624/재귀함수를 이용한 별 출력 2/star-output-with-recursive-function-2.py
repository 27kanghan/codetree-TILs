n = int(input())

# Please write your code here.

def print_Star(n) :
    if (n == 0) :
        return;

    
    print("* " * n)
    print_Star(n-1);
    print("* " * n)


print_Star(n);