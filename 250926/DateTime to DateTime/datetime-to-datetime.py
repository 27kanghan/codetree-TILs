# 2011년 11월 11일 11분에 시작해서 11월 A일 B시 C분까지.
# A일은 24시간. A * 24 * 60 + B * 60 + c

a, b, c = map(int, input().split())

time1 = 11 * 24 * 60 + 11 * 60 + 11
time2 = a * 24 * 60 + b * 60 + c

answer = 0;

if time1 > time2 :
    answer = -1;
else :
    answer = time2 - time1
print(answer)