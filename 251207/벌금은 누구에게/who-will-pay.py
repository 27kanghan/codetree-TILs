N, M, K = map(int, input().split());

arr = [0] * (N+1);


answer = -1;

for i in range (M) :
    num = int(input());

    arr[num] += 1;

    if arr[num] == K :
        answer = num;
        break;


print(answer)
