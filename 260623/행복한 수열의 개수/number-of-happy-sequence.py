import sys
input = sys.stdin.readline

N, M = tuple(map(int, input().split()))
grid = [list(map(int, input().split())) for _ in range(N)]

answer = 0

if M == 1:
    print(2 * N)
else:
    answer = 0

    for i in range(N) :
        cnt = 1;
        for j in range(N-1) :
            if grid[i][j] == grid[i][j+1] :
                cnt += 1
                if cnt>= M :
                    answer += 1
                    break;
                continue
            cnt = 1    
        # print(cnt)


    for i in range(N) :
        cnt = 1;
        for j in range(N-1) :
            if grid[j][i] == grid[j+1][i] :
                cnt += 1
                if cnt>= M :
                    answer += 1
                    break; 
                continue

            cnt = 1   
        # print(cnt)
        

    print(answer)
            
