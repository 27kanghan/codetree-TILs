# 2011년 11월 11일 A시 B분에 시작, 11년 11월 11이 C시 D분까지 몇 분?
# A시 B분이니까 60 * A + b분을 60 * C + b분에서 빼주면 될듯

a, b, c, d = map(int, input().split())

time1 = a*60+b;
time2 = c*60+d;

print (time2-time1)