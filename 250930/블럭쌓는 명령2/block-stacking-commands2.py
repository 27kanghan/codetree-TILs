#1번부터 N번까지.
#Ai부터 Bi까지 블럭 쌓으라고 K번째 말합니다~

N, K = tuple(map(int,input().split()))

arr = [0 for _ in range (N+1)]

max_value = 0;
for i in range (K) :
    start , end = tuple(map(int,input().split()))

    for j in range(start, end+1):
        arr[j] += 1;
        max_value = max(max_value, arr[j])

print(max_value)