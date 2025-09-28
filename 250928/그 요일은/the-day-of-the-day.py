# 24년 m1월 d1일이 월요일.
# m2 d2 까지 A요일이 몇번?

m1, d1, m2, d2 = tuple(map(int, input().split()))
day = input()

#월요일부터 목표 요일까지 며칠차이인지 구한다.
#현재 날짜로부터 + 해준다.
# 그날짜부터 목표 날짜까지 며칠걸리는지 구한다.


days = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

day_of_weeks = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"]

day_diff = day_of_weeks.index(day)

d1 += day_diff

def get_total_days(m, d) :

    total_days = 0;

    for i in range (1, m) :
        total_days += days[i]

    return total_days + d

total_days = get_total_days(m2,d2) - get_total_days(m1,d1)

calulated_days = total_days // 7 + 1

print(calulated_days)

