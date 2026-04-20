import sys
input = sys.stdin.readline

X, Y = map(int, input().split())

answer = 1

def sum_of_num (num) :
    if num < 10 :
        return num

    return num % 10 + sum_of_num(num // 10) 


for i in range (X, Y+1) :
    answer = max(answer, sum_of_num(i))

print(answer)

