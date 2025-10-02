# 0에서 시작, N번의 명령, 2번 이상 지나간 영역

#cur_x

N = int(input());


arr = [0] * 1001

cur_x = 500;

for i in range (N) :
    vector, direction = input().split()
    vector = int(vector)

    if direction == 'L' :
        for j in range (vector, -1, -1) :
            arr[cur_x+j] += 1
        cur_x -= vector
    else :
        for j in range (0, vector) :
            arr[cur_x+j] += 1
        cur_x += vector

answer_count = 0;

for i in range (len(arr)) :

    if arr[i] >= 2 :
        answer_count +=1 

print(answer_count)
