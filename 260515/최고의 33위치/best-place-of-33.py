import sys
input = sys.stdin.readline

N = int(input())
arr = [list(map(int,input().split())) for _ in range(N)]


def in_range(i,j):
    return i >= 0 and j >= 0 and i < N and j < N


def get_gold(col,raw):
    counting_gold = 0
    flag = True
    #넘겨받은걸 기준으로 3x3 해야함
    #얘네가 범위 안인지 확인해야함
    for i in range(raw, raw+3) :
        for j in range(col, col+3) :
            if not in_range(i,j) :
                flag = False
                break;
            if(arr[i][j] == 1) :
                counting_gold += 1    

    if flag == True :
        return counting_gold

    return 0


#시작 위치 잡아서 함수에 넘겨주기
answer = 0
for i in range(N) :
    for j in range(N) :
        answer = max(answer,get_gold(i, j))

print(answer)

