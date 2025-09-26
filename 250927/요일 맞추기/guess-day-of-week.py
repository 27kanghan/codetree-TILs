# 2011년 m1월 d1일 = 월
# 2011년 m2 d2ㄴ느 무슨요알?

m1, d1, m2, d2 = tuple(map(int,input().split()))

days = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"]
days_of_month = [0,31,28,31,30,31,30,31,31,30,31,30,31]

#m1 - d2가 월요일


def get_days(m1, d1, m2, d2) :

    days1 = 0;
    days2 = 0;
    for i in range (1, m1+1) :
        days1 += days_of_month[i]
    
    days1 += d1

    for i in range(1, m2+1) :
        days2 += days_of_month[i]

    days2 += d2;

    return days2 - days1


total_days = get_days(m1,d1,m2,d2)

# print(total_days)

answer = ''

if total_days >= 0 :
    num = total_days % 7
else :
    num = abs(total_days) % 7
    if num != 0:
        num = 7 - num;

# print(num)

answer = days[num]

print(answer)
