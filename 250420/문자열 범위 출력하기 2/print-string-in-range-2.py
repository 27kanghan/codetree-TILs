string = input();
num = int(input());

end = len(string)-num-1;

if end <= -1 :
    end = -1;


for i in range(len(string)-1, end, -1) :
    print(string[i], end='');