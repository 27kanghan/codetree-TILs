import sys
input = sys.stdin.readline



# 2배하고 복사하고 제거하고 계산하고 (제거한 것들 중 최대값을 뽑고) 그것들중에서 또 최대값을 뽑는다

N = int(input())

number = list(map(int, input().split()))

# 1. 2배하기
min_diff = sys.maxsize
for i in range(N) :
    number[i] = number[i] * 2
    # print(f"{i}번 째 둗배")

    #2. 복사하기

    for j in range(N) :
        copy = []
        for k in range(N) :
            if k != j :
                copy.append(number[k])
        # print(copy)
        
        sum_diff = 0

        for k in range(N-2) :
            sum_diff += abs(copy[k+1] - copy[k])
        
        # print(sum_diff)
        min_diff = min(min_diff, sum_diff)

    # final : 2배한거 돌려놓기
    number[i] = number[i] // 2

print(min_diff)