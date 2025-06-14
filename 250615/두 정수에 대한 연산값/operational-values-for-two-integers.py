a, b = map(int, input().split());

# 큰 수에 25 더하기. 작은수 2 곱하기

def calculate(a,b) :

    if a > b :
        a += 25;
        b *= 2;
    else :
        a *= 2;
        b += 25;

    return a, b

a,b = calculate(a,b);

print(a, b)