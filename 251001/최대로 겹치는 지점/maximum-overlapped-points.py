#끝에서 닿는것도 겹친다.
#선분 몇개 겹치는지

arr = [0] * 101

n = int(input());

for i in range (n) :
    start, end = tuple(map(int, input().split()))

    for j in range(start, end+1) :
        arr[j] += 1


arr = sorted(arr, reverse = True)

print(arr[0])