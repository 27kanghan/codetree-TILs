arr = list(map(int, input().split()));

li = list();
for i in range (len(arr)-1,-1 , -1) :
    if(arr[i] == 0 ) :
        continue;
    li.append(arr[i]);

for i in range (len(li)) :
    print(li[i], end= ' ');