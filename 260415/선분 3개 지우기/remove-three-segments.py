import sys
input = sys.stdin.readline

N = int(input())
arr = [tuple(map(int, input().split())) for _ in range(N)]

cnt = 0;

for i in range(N) :
    for j in range(i+1, N) :
        for k in range (j+1, N) :
            
            flags = False
            copy = [0] * 101;

            for x in range(N) :
                if i == x or x == j or x == k :
                    continue

                for y in range(arr[x][0], arr[x][1]+1) :
                    copy[y] += 1
                
            for x in range(101) :
                if copy[x] > 1 :
                    flags = True
            
            if flags == False :
                cnt+=1
                        

print (cnt)