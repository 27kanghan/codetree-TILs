import sys
input = sys.stdin.readline

N, B = map(int,input().split())
people = [int(input()) for _ in range(N)]
p = [0] * N



answer = 0;

def copy() :
    for i in range(0, N) :
        p[i] = people[i]

for i in range(N) :
    copy()
    
    p[i] = p[i]//2
    p.sort()

    sum = 0
    cnt = 0
    for j in range(N) :
        sum += p[j]
        if sum > B :
            break;
        cnt += 1
    answer = max(answer,cnt)



print(answer)