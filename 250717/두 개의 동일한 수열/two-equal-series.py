# n 개의 원소로 이루어진 수열 A, B 두개가 같으면 ->> Yes 아니면 No

n = int(input());

A = list(map(int, input().split()));
B = list(map(int, input().split()));

A = sorted(A);
B = sorted(B);


def valid() :
    for i in range (0, n) :
        if A[i] != B[i] :
            return False;
    
    return True;


if valid() :
    print("Yes")
else :
    print("No")