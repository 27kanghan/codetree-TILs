n, m = map(int, input().split())

def get_gcd (n,m) :
    
    big = max(n,m);
    
    gcd = 0;


    for i in range (1, big+1) :
        if n % i == 0 and m % i == 0:
            gcd = i;
    
    return gcd;

print(get_gcd(n,m));