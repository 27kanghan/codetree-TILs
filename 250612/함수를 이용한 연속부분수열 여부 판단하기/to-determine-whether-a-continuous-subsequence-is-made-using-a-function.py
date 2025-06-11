n1, n2 = map(int, input().split());
a = list(map(str, input().split()));
b = list(map(str, input().split()));

string1 = "".join(a);
string2 = "".join(b);

if string1.find(string2) == 1 :
    print("Yes")
else :
    print("No")
# Please write your code here.