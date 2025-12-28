import sys
input = sys.stdin.readline

x, y = 0, 0
dx, dy = [1, 0, -1, 0], [0, -1, 0, 1]
cur_dir = 3;

command = input();


for i in range(0, len(command)-1) :
    if(command[i] == "L") :
        cur_dir = (cur_dir-1+4) % 4
    elif(command[i] == "R") :
        cur_dir = (cur_dir+1) % 4
    else :
        x += dx[cur_dir]
        y += dy[cur_dir]

print(x, y)
