input_str = input();
goal_str = input();

cnt = 0;

while True :
    if input_str == goal_str :
        print(cnt);
        break;
    elif cnt == len(goal_str) :
        print(-1)
        break;

    input_str = input_str[-1] + input_str[:-1]
    #print(input_str);
    
    cnt += 1;


