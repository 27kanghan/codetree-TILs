n = int(input());
arr = list(map(int, input().split()));

def modify (n, arr) :

    for i in range (0, n) :
        if arr[i] % 2 == 0 :
            arr[i] = arr[i] // 2

modify(n, arr);

for elem in arr :
    print(elem, end = ' ');