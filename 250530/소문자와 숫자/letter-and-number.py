str1 = input();

str2 = ''

for i in range (0, len(str1)) :
    if str1[i].isalpha() :
        str2 += str1[i].lower()
    elif str1[i].isdigit() :
        str2 += str1[i];

print(str2)
