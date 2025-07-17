n = int(input());

arr = list(map(int, input().split()));
# Please write your code here.

arr.sort();

answer = 0;

for i in range(0, len(arr)-1) :
    
    answer = max(answer, arr[i]+arr[len(arr)-i-1])

print(answer);