arr = list(map(int, input().split()));

for i in range (len(arr)-1,-1 , -1) :
    if(arr[i] == 0 ) :
        continue;
    print(arr[i], end=' ');