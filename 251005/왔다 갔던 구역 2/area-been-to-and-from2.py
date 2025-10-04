N = int(input())

arr = [0] * 2002

cur_x = 1001

for i in range (N) :
    start, direction = input().split()
    start = int(start)
    
    if direction == 'R' :
        for j in range (cur_x, cur_x+start) :
            arr[j] += 1
        cur_x += start
    else :
        for j in range (cur_x, cur_x-start, -1) :
            arr[j] += 1
        cur_x -= start
    # print(cur_x-1001)

answer = 0;

for i in range (0, len(arr)) :
    if arr[i] >= 2 :
        answer +=1 ;

print(answer)
        
        
    
    

    