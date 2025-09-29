A, B = tuple(map(int,input().split()))
N = (input())

B = int(B);

num = 0;

for i in range(len(N)):
    num = num * A + int(N[i])


nums = []

while True :

    nums.append(num % B)

    if num // B == 0 : break;

    num //= B

# A진수로 표현된 N을 B진수로 변환 
# A진수를 10진수로 -> B진수로하면됨


for i in nums[::-1] :
    print(i, end = "")

