y = int(input())

# Please write your code here.
def valid (year) :

    # 4로 떨어지는 해
    # 100으로 나누어 떨어지지만 400으로 나누어 떨어지지 않으면 평년

    if year % 4 == 0 :
        if year % 100 == 0 and year % 400 != 0 :
            return False;
        return True;

    return False;
    
print("true" if valid(y) else "false" )