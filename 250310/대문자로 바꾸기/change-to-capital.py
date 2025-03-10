arr_2d = [
	list(map(str, input().split()))
	for _ in range(5) 
]

for i in range(5) :
    for j in range(3) :
        print(arr_2d[i][j].upper(), end = ' ');
    print();
    
