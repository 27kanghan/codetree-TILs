# 2011년 m1월 d1일 = 월
# 2011년 m2 d2ㄴ느 무슨요알?

m1, d1, m2, d2 = tuple(map(int,input().split()))

days = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"]
days_of_month = [0,31,28,31,30,31,30,31,31,30,31,30,31]

#m1 - d2가 월요일


def get_days(m1, d1, m2, d2) :

    days = 0;

    start_m = 0;
    start_d = 0;
    end_m = 0;
    end_d = 0;

    if m1 >= m2 :
        start_m = m2;
        start_d = d2;
        end_m = m1;
        end_d = d1
    else :
        start_m = m1;
        start_d = d1;
        end_m = m2;
        end_d = d2;
    
    for i in range (start_m, end_m) :
        days += days_of_month[i]
        # print(days)

    # print(days)

    return abs(days - start_d + end_d)


total_days = get_days(m1,d1,m2,d2)

# print(total_days)

answer = ''

if m1 <= m2 :
    num = total_days % 7
else :
    num = abs(total_days) % 7
    if num != 0:
        num = 7 - num;

# print(num)

answer = days[num]

print(answer)
