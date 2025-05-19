str1 = input();

arr = list(str1);

for i in range(0, len(arr)) :
    if arr[i] == 'e' :
        arr.pop(i);
        break;


str1 = ''.join(arr);

print(str1);