stringArr = ["apple", "banana", "grape", "blueberry","orange"];

word = input();

cnt = 0;

for elem in stringArr :
    for i in range (0, len(elem)) :
        if elem[i] == word and (i == 2 or i == 3) :
            cnt+=1;
            print(elem);
            break;
print(cnt)

