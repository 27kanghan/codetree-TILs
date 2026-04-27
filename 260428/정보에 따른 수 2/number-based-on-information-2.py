import sys
input = sys.stdin.readline

T, a, b = map(int,input().split())

S_list = list()
N_list = list()

for i in range(T) :
    alpha, target = input().split()
    target = int(target)

    if alpha == "S" :
        S_list.append(target)
    else :
        N_list.append(target)

# a~b까지 비교

def calculate_diff(num) :

    s_diff = sys.maxsize
    n_diff = sys.maxsize

    # s부터
    for li in S_list :
        s_diff = min(s_diff, abs(num-li))
    
    for li in N_list :
        n_diff = min(n_diff, abs(num-li))



    return s_diff, n_diff

answer = 0;

for i in range(a, b+1) :
    s_diff, n_diff = calculate_diff(i)

    if s_diff <= n_diff :
        answer += 1

print(answer)
