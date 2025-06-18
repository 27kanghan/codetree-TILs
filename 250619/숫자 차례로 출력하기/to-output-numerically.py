n = int(input())


def cal(n) :

    if n == 0 :
        return
    

    cal(n-1)
    print(n, end= ' ')

def cal2(n) :
    if n == 0:
        return

    print(n, end=' ')
    cal2(n-1)
    

cal(n);
print()
cal2(n)