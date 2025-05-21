str1, str2 = input().split();

num1 = ord(str1);
num2 = ord(str2);

sumval = num1+num2;

minval = 0;

if num1 >= num2 :
    minval = num1 - num2;
else :
    minval = num2 - num1;

print(sumval, minval)