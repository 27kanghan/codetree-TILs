arr = list(map(int, input().split()))

days = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

# m1 월 d1일로 부터 m2월 d2일까지 얼마나 걸리는지?

# 11월 5일

m1 = arr[0]
d1 = arr[1]
m2 = arr[2]
d2 = arr[3]

sum_of_days = 0;

for i in range (m1, m2) :
    # print(days[i])
    sum_of_days += days[i]
# print(sum_of_days)

answer = sum_of_days - d1 + d2 + 1

print(answer)