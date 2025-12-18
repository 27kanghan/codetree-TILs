N, M = tuple(map(int, input().split()))

a_move = [0] * (1000 * 1000+1)
b_move = [0] * (1000 * 1000+1)

leader_change_count = 0;
leader = " ";
total = 0;
cur = 0;
for i in range(0, N) :
    v, t = tuple(map(int,input().split()))
    total+=t;

    for j in range (cur, cur+t) :
        a_move[j+1] = a_move[j] + v;
    cur = cur+t;


cur = 0;
for i in range(0, M) :
    v, t = tuple(map(int,input().split()))

    for j in range (cur, cur+t) :
        b_move[j+1] = b_move[j] + v;
    cur += t


for i in range(1, total+1) :
    if a_move[i] > b_move[i] and leader != "A" :
        leader_change_count += 1;
        leader = "A"
    elif a_move[i] < b_move[i] and leader != "B" :
        leader_change_count += 1;
        leader = "B"
    # print(f"현재 선두 : {leader} \n a : {a_move[i]} \n b : {b_move[i]}")
    # print(" ")

print(leader_change_count-1)
