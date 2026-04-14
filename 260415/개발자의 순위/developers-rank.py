import sys
input = sys.stdin.readline

K, N = map(int,input().split())
arr = [list(map(int, input().split())) for _ in range (K)]

# flags = False
cnt = 0

for i in range(1, N+1) :
    for j in range(1, N+1) :
        
        if i == j :
            continue
        
        flags = True

        for lists in arr :
            i_idx = lists.index(i) 
            j_idx = lists.index(j)

            if i_idx > j_idx :
                flags = False
        
        if flags :
            cnt+=1

print(cnt)

