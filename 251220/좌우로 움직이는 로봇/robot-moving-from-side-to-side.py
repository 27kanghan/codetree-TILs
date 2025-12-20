a_move = [0] * 1000000
b_move = [0] * 1000000
a_cur = 0
b_cur = 0

N, M = tuple(map(int, input().split()))

#연산 횟수 조금이라도 줄이기
a_total_time = 0;
b_total_time = 0;

a = 0;
b = 0;

# a부터
for i in range(0, N) :
    t, d = input().split();
    t = int(t);
    a_total_time += t;

    # L, R일때 가정, 
    if d == "R" :
        for i in range(0, t) :
            a_cur += 1;
            a_move[a] = a_cur;
            a += 1;
    elif d == "L" :
        for i in range(0, t) :
            a_cur -= 1;
            a_move[a] = a_cur;
            a += 1;

    # a += t;
    

# print(a_move)           

for i in range(0, M) :
    t, d = input().split();
    t = int(t);
    b_total_time += t;

    # L, R일때 가정, 
    if d == "R" :
        for i in range(0, t) :
            b_cur += 1;
            b_move[b] = b_cur;
            b+= 1;
    elif d == "L" :
        for i in range(0, t) :
            b_cur -= 1;
            b_move[b] = b_cur;
            b+=1;
    # b+=t;


max_value = max(a_total_time, b_total_time)

#padding
if a_total_time > b_total_time :
    for i in range (b_total_time, a_total_time) :
        b_move[i] = b_move[i-1]
else :
    for i in range (a_total_time, b_total_time) :
        a_move[i] = a_move[i-1]

#겹치는지 판별 위한 flag

flag = True;
answer = 0;

#valid
for i in range(0, max_value) :
    # print(a_move[i], b_move[i])
    if (a_move[i] == b_move[i] and not flag) :
        # print(f"match! {i}")
        flag = True
        answer += 1;
    elif(a_move[i] != b_move[i]) :
        flag = False;
    # print(f"{i} = {flag}")

print(answer)

    
