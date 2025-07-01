a, b, c = map(int, input().split())

# Please write your code here.

num = a*b*c;

def get_n(num) :

    if(num  < 10) :
        return num

    return get_n(num//10) + get_n(num%10);
    
print(get_n(num))