import sys
input = sys.stdin.readline

N = int(input())
a_arr = list(map(int, input().split()))

# 1. K를 먼저 정의한다. (for문 사용)
# 2. 정의된 K를 바탕으로 a0 K a1, a0 k a2, a0 k a3 이렇게 비교를 쭉 하면 됨.
# 3. 기저조건은? 나중에 정의하면 될듯?
# 4. 결국 구할 건 K를 정의 했을 때 틍차 수율의 개수가 최대가 되어야 한다 (answer)

def calculate(a1,a2,k) :
    # print(a1,k, a2)
    if (a2 - k) == (k-a1):
        return True

    return False

answer = 0
min_val = sys.maxsize
max_val = -1

for i in a_arr :
    min_val = min(min_val, i)
    max_val = max(max_val, i)

start_k = min_val
end_k = max_val

for k in range (start_k+1, end_k) :
    cnt = 0
    for i in range(0, N) :
        for j in range(i+1, N) :
            a1,a2 = a_arr[i], a_arr[j]

            if a1 == k or a2 == k : 
                continue

            if calculate(a1,a2,k) :
                cnt += 1
    answer = max(answer, cnt)

print(answer)



