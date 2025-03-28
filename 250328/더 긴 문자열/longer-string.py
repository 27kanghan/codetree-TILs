str1, str2 = tuple(map(str, input().split()));

len1 = len(str1);
len2 = len(str2);

if len1 > len2 :
    print(f"{str1} {len1}")
elif len1 < len2 :
    print(f"{str2} {len2}")
else :
    print("same")