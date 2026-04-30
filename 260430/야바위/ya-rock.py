import sys
input = sys.stdin.readline

N = int(input())
command = []

for _ in range(N) :
    command.append(list(map(int,input().split())))

answer = 0

for i in range(4):
    cup = [0] * 4
    point = 0
    cup[i] = 1

    for a,b,c in command :
        index = cup[a]
        cup[a] = cup[b]
        cup[b] = index

        if cup[c] == 1 :
            point +=1
    
    answer = max(answer, point) 

print(answer)

