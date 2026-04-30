import sys
input = sys.stdin.readline

X,Y = map(int, input().split())

def valid(num) :
    original = num
    reverse_num = 0
    while(num > 0) :
        digit = num % 10

        reverse_num = reverse_num * 10 + digit

        num //= 10

    # print(original, reverse_num)

    if original == reverse_num :
        return True    

    return False

# 숫자를 배열에 담고
# 1. 정방향 숫자와 역방향 숫자를 만들어서 이게 같나 비교하면 됨.

answer = 0
for i in range(X, Y+1) :
    if valid (i):
        answer += 1

print(answer)
    