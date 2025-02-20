arr = list(map(int, input().split()));

even = 0;
odd = 0;

for i in range (0, 10) :
    if (i+1) % 2 == 0 :
        even += arr[i];
    else :
        odd += arr[i];



print(even-odd if even >= odd else odd - even);