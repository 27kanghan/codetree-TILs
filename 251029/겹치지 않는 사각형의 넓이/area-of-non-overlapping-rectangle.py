arr = [ [0] * 2000 for i in range (2000)]

cur = 1000;



# 칸 채우기
for num in range (3) :
    x1, y1, x2, y2 = tuple(map(int, input().split()));
    x1 += cur;
    y1 += cur;
    x2 += cur;
    y2 += cur;
    for i in range (x1, x2) :

        for j in range (y1, y2) :
            if num != 2 :
                arr[i][j] = 1
            else :
                arr[i][j] = 0;


area = 0;

for i in range (0, 2000) :
    for j in range (0, 2000) :
        if arr[i][j] == 1:
            area+=1;

print(area)
            

    


# Please write your code here.