import sys

input = sys.stdin.readline

N = int(input());

board = [list(map(int, input().split())) for _ in range(N)]


#0,0에서 start
# 주변에 1이 몇개 적혀있나 봐야함.
# 전략? -> 0,0에서부터 상 하 좌 우를 확인한다
# r, c = 상 : (1,0) 하 : (-1,0) , 좌 ( 0, -1), 우 : (0, 1)

start_r, start_c = 0, 0

dr = [1,-1,0,0]
dc = [0,0,-1,1]

# 범위 안인지 체크하는 함수
def inRange(nr,nc) :
    
    return nr >= 0 and nc >= 0 and nr < N and nc < N

# 도는 중 생각해야 할 것 : nr, nc가 in range인가? and nr, nc가 1인가?
# 이를 만족하는 좌표의 갯수를 센다.
# 필요한 메서드 : inRange

answer = 0;

for i in range(0, N) :
    for j in range(0, N) :
        cnt = 0;
        start_r,start_c = i,j

        for d in range (0, 4) :
            nr = start_r + dr[d % 4]
            nc = start_c + dc[d % 4]   
            if inRange(nr,nc) and board[nr][nc] == 1:               
                cnt+=1
            
            d += 1

        if cnt >= 3 :
            answer += 1

print(answer);









