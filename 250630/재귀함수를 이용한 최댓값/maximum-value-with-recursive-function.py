n = int(input())
arr = list(map(int, input().split()))

# Please write your code here.

# 최대값 구하기

# 재귀함수로 구하기

def get_max(N, arr) :
    
    if(N == 0) :
        return arr[0]

    return max(arr[N],get_max(N-1,arr))



print(get_max(n-1,arr))