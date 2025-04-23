A = input()

string ='';
cnt = 1;
for i in range(0, len(A)) :
    if i+1 > len(A)-1:
        string = string+A[i]+str(cnt);
    elif A[i] == A[i+1] :
        cnt+=1;
    elif A[i] != A[i+1] :
        string = string+A[i]+str(cnt);
        cnt = 1;        


print(len(string));
print(string);
