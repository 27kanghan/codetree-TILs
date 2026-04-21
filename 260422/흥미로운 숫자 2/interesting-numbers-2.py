import sys
input = sys.stdin.readline
X,Y = map(int, input().split())


def get_interesting_number(num) :
    s = str(num)

    unique_digits = set(s)
    if(len(unique_digits) != 2) :
        return False
    
    for d in unique_digits:
        if s.count(d) == 1:
            return True

    return False


answer = 0;

for i in range(X, Y+1) :
    if(get_interesting_number(i) == True) :
        answer += 1

print(answer)

