arr = input().split();

a = int(arr[0]);
b = int(arr[1]);
c = int(arr[2]);

arr = [a,b,c];

print(sum(arr));
print(sum(arr)//len(arr));
print(sum(arr) - sum(arr)//len(arr));