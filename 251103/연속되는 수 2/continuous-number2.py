N = int(input())

num_arr = [
    int(input()) for i in range(N)
]

max_num_count = 0;
count = 1;


for i in range (N-1) :
    if num_arr[i] == num_arr[i+1] :
        count +=1;
    else :
        count = 1;

    max_num_count = max(count, max_num_count);

print(max_num_count)