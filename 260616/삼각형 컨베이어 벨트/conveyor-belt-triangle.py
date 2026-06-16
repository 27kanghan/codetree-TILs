import sys
input = sys.stdin.readline

N, T = tuple(map(int, input().split()))

a = list(map(int,input().split()))
b = list(map(int,input().split()))
c = list(map(int,input().split()))

belt = a+b+c

for i in range(T) :
    temp = belt[N*3 - 1]

    for j in range(N*3-1, 0, -1) :
        belt[j] = belt[j-1]
    
    belt[0] = temp

for i in range(N*3) :
    if i == N or i == N * 2 :
        print()   
    print(belt[i], end=" ")    