n, m = map(int, input().split())

# Please write your code here.
def get_grc(n,m) :
    
    grc = 0;

    for i in range (1, min(n,m) + 1):
        if n % i == 0 and m % i == 0:
            grc = i;
    
    return grc;

grc = get_grc(n,m);

def get_answer(grc,n,m) :

    
    answer = 0;
    cnt = 1;
    while True :
        grc = grc * cnt;
        if grc % n == 0 and grc % m == 0 :
            answer = grc;
            break;
        cnt +=1

    return answer;

print(get_answer(grc,n,m));