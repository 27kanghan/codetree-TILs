N, M = map(int, input().split());
arr = list(map(int, input().split()))


# 수열 A가 주어짐.
# M이 주어진다. M이 1이될 때 까지 홀수면 1 빼고, 짝수면 2로 나눔.
# list의 M번째 원소를 계속 더해줌.

def cal (N,M) :
    sum_val = arr[M-1];


    while(True) :
        if M % 2 == 0 :
            M = M // 2;
        else :
            M -= 1
        
        sum_val += arr[M-1];
        if M == 1 :
            break;

    return sum_val;


print(cal(N,M))