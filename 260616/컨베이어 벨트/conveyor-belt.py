import sys
input = sys.stdin.readline

N, T = tuple(map(int, input().split()))

# print(N)

up = list(map(int, input().split()))
down = list(map(int, input().split()))

belt = up+down
# print(belt)


for i in range(T) :
    temp = belt[N*2-1]

    for j in range(N*2-1 , 0,-1) :
        # print(j)
        belt[j] = belt[j-1]

    belt[0] = temp
    # print(belt)    


for i in range(N*2) :
    if i == N :
        print()
    print(belt[i], end = " ")

         
