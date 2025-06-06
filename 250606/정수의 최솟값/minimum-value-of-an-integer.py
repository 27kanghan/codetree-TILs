a, b, c = map(int, input().split())

# Please write your code here.

def get_min(a,b,c) :

    return min(a,min(b,c))


print(get_min(a,b,c))