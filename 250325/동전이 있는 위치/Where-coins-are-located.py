n, m = tuple(map(int, input().split()))

arr = [
    [0 for _ in range(n)]

    for _ in range (n)
]

for i in range (0, m) :
    r, c = tuple(map(int, input().split()))

    arr[r-1][c-1] = 1;

for a in arr :
    for elem in a :
        print(elem, end=' ')
    print();