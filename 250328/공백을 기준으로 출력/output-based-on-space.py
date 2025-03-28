str1 = input();

str2 = input();

newStr = '';

for i in range (len(str1)) :
    if str1[i] != ' ' :
        newStr += str1[i]

for i in range (len(str2)) :
    if str2[i] != ' ' :
        newStr += str2[i]

print(newStr)