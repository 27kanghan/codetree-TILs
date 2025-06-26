N = int(input())

#N이 주어지는데, N이 짝수면 2로 나누고 홀수면 3으로 나는 몫을반복. 횟수를 리턴함.

def count(n) :

    if n == 1 :
        return 0;
    
    if n % 2 == 0 :
        return count(n//2) + 1
    else :
        return count(n//3) + 1;


print(count(N))

