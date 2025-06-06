n = int(input())

# Please write your code here.


def calculate(num) :
    # 1부터 전달받은 수의 합을 10으로 나눈 값 반환 -> 출력

    sum_val = 0;

    for i in range(1, num+1) :
        sum_val += i;

    return sum_val // 10; 
    

print(calculate(n))    