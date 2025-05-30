num1, num2 = input().split();

str1 = '';
str2 = '';

for i in range(0, len(num1)):
    if num1[i].isdigit() :
        str1 += num1[i]
    else :
        break;

for i in range(0, len(num2)):
    if num2[i].isdigit() :
        str2 += num2[i]
    else :
        break;


print(int(str1) + int(str2))


