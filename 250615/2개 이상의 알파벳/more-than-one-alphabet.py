A = input()

def valid (a) :
    
    cnt = 0;
    for i in range(0, len(a)) :
        for j in range(1, len(a)) :
            if a[i] != a[j] :
                cnt += 1;
                break;
        if cnt >= 2 :
            return True;
    
    return False;

if valid(A) :
    print("Yes");
else :
    print("No");
