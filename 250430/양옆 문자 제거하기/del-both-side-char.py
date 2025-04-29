str1 = input();

arr = list(str1);

arr.pop(1);

arr.pop(len(str1) - 3);

newStr = ''.join(arr);

print(newStr);