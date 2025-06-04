n = int(input())

cnt = 1;

def make_square(n, cnt) :
    
    for i in range(0, n) :
        for j in range(0, n) :
            print(cnt, end=' ');
            cnt+=1;
            if cnt >= 10 :
                cnt = 1;
        print();

make_square(n, cnt);
        
