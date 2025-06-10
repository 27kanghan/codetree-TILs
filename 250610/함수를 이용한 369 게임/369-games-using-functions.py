a, b = map(int, input().split())

# Please write your code here.

# A <= Num <= B 3, 6, 9 하나가 들어가있거나 그 수 자체가 3의 배수인 수의 개수 체크

def checking_369(a, b) :
    cnt = 0;

    for i in range (a, b+1):
   
        if (str(i).find("3") >= 0 or str(i).find("6") >= 0 or str(i).find("9") >= 0) or i % 3 == 0  :
            cnt += 1;

    return cnt;


print(checking_369(a,b));