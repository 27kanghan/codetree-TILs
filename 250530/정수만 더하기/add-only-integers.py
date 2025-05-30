str1 = input();

sumVal = 0;

for i in range (0, len(str1)) :
    if str1[i].isdigit() :
        sumVal += int(str1[i])

print(sumVal);