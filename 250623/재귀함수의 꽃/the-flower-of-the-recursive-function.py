N = int(input())

# Please write your code here.

def re(n) :

    if n == 0 :
        return 
    

    print(n, end =' ')
    re(n-1)
    print(n, end = ' ')

    
re(N)