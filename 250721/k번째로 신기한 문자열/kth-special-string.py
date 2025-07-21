N, K, T = input().split();

N = int(N);
K = int(K);

arr = [
    input() for _ in range (N) 
]

new_arr = [];

for i in range (0, len(arr)) :
    str1 = arr[i];

    if str1[0:2] == T :
        new_arr.append(str1)

new_arr = sorted(new_arr);

print(new_arr[K-1]);