A = input()
B = input()


while True :
    if A.find(B) == -1 :
        break;
    idx = A.index(B);
    A = A[:idx] + A[idx+len(B):]

print(A)