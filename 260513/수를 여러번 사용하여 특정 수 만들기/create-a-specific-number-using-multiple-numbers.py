import sys
input = sys.stdin.readline

A,B,C = map(int, input().split())

# 2중 for문을 써보자.
# 각각의 최대 횟수는 어떤식으로 구할 건가?
# 최대 횟수 구하지 않고 하려면 while문이 적합하다.
# 최대 횟수는 A가 1 B가 1 C는 1000까지니까,
# A, B가 각각 1일때 최대횟수는 1000회다. !000*1000 = 1,000,000 백만회면 시간은충분함.

answer = 0;
for i in range(1000):
    # A횟수
    A_com = A*i
    
    B_com = 0
    sum_val = 0
    for j in range(1000) :
        if A_com > C :
            break
        #B횟수
        B_com = B*j
        
        if A_com + B_com > C :
            B_com = B*(j-1)
            break
        
    if A_com + B_com > C :
        continue
    
    answer = max(A_com+B_com, answer)

print(answer)





