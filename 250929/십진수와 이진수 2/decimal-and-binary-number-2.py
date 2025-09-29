# 2진수 N을 10진수로 바꿔 * 17 하고 다시 2진수


N = input()

num = 0;

#10진수 변환
for i in range (len(N)) :
    num = num * 2 + int(N[i])

#10진수 * 17 후 2진수

num *= 17

digits = []

while True :

    digits.append(num % 2)
    if num // 2 == 0 : break;

    num //= 2;


for i in digits[::-1] :
    print(i, end='')