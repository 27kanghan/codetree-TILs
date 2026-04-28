import sys
input = sys.stdin.readline

N = int(input())

ice_berg = []

max_berg = -1

for i in range(N) :
    num = int(input())
    ice_berg.append(num)
    max_berg = max(max_berg, num)


answer = 0

for i in range(max_berg) :
    cnt = 0
    flag = False;
    for j in range(N) :
        if ice_berg[j] > i:
            if not flag:
                flag = True
                cnt+=1
        else:
            flag = False
            
    
    answer = max(answer, cnt)

print(answer)


