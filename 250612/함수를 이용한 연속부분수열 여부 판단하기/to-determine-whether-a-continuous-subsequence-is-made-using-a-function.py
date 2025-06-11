n1, n2 = map(int, input().split());
a = list(map(str, input().split()));
b = list(map(str, input().split()));

string1 = "".join(a);
string2 = "".join(b);

# print(string1, string2)
# print(string1 in (string2))

if string2 in string1 :
    print("Yes")
else :
    print("No")
# Please write your code here.