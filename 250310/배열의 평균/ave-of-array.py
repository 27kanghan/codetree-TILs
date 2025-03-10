
arr = [
    list(map(int, input().split()))

    for _ in range (2)
]

avg_val = 0;
total_val = 0;

for i in range(2) :
    sum_val = 0;
    for j in range(4) :
        sum_val += arr[i][j];
       
    print(sum_val / 4, end = ' ');
print();

for i in range(4) :
    sum_val = 0;
    for j in range(2) :
        sum_val += arr[j][i];
    print(sum_val / 2, end = ' ');

for i in range (2) :
    for j in range (4) :
        total_val += arr[i][j];

print();
print(total_val / 8);
