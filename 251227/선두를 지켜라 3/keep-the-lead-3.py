N, M = tuple(map(int, input().split()))

# a,b 각각 위치 배열
# a,b 현재 위치?
# 선두 바뀐건 1, 2, 3으로 leader로
# 아! 배열을 append로 하면되겠네

max_value = 1000 * 1000;

total_time = 0;

a_arr = [0]
b_arr = [0]

# v, t

# a먼저

for i in range (0, N) :
    v, t = tuple(map(int, input().split()))

    for j in range (0, t) :
        a_arr.append(a_arr[-1]+v)

# print(a_arr)
#그다음 b

for i in range (0, M) :
    v, t = tuple(map(int, input().split()))

    for j in range (0, t) :
        b_arr.append(b_arr[-1]+v)

# print(b_arr)

#다음 task -> 두개 비교하면서 선두 바뀔때마다 answer 추가하기.
# 주의 : 맨 처음은 0이기에 그냥 둔다.
# a = 1, b = 2, a+b = 3

leader = 0;
answer = 0;

for i in range (1, len(a_arr)) :
    if leader == 1 or leader == 0 :
        if a_arr[i] == b_arr[i] :
            leader = 3
            answer += 1
        elif a_arr[i] < b_arr[i] :
            leader = 2
            answer += 1
    if leader == 2 or leader == 0 :
        if a_arr[i] == b_arr[i] :
            leader = 3
            answer += 1
        elif a_arr[i] > b_arr[i] :
            leader = 1
            answer += 1
    if leader == 3 or leader == 0 :
        if a_arr[i] > b_arr[i] :
            leader = 1
            answer += 1
        elif a_arr[i] < b_arr[i] :
            leader = 2
            answer += 1;

print(answer)