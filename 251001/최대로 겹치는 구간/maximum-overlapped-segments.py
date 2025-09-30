# 음수도 가능이다.
# -100 <= x1 < x2 <= 100
# 걍 200개로 주자 

arr = [0] * 202

n = int(input())

for i in range (0, n) :
    start_point, end_point = tuple(map(int, input().split()))

    for j in range (start_point, end_point) :
        arr[j] +=1;


arr = sorted(arr, reverse = True)

print(arr[0])