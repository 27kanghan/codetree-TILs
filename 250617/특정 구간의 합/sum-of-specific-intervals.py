n, m = map(int, input().split())
arr = list(map(int, input().split()))
queries = [tuple(map(int, input().split())) for _ in range(m)]

# Please write your code here.


def cal() :
    global n, m;

   

    for i in range (0, m) :
        sum_val = 0;
        num1 = queries[i][0];
        num2 = queries[i][1];
        for j in range (num1-1, num2) :
            sum_val += arr[j];

        # sum_val += num1+num2;

        print(sum_val)
        
cal()