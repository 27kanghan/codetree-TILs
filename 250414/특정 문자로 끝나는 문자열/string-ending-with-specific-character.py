string = [
    input()
    for _ in range(10)
]

word = input();
cnt = 0;

for elem in string :
    if elem[len(elem)-1] == word :
        print(elem);
        cnt+=1

if cnt == 0:
    print("None")