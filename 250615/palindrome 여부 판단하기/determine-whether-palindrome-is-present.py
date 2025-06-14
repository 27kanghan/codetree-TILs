A = input()

# Please write your code here.

arr = list(A);

def is_palindrome (arr) :
    return arr.reverse();

lis = is_palindrome(arr);

if A == ''.join(arr) :
    print("Yes");
else :
    print("No");