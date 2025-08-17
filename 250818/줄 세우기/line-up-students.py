# 키가 더 큰 항생이 앞에
# 키가 동일하면 몸무가게 더 큰 학생
# 키 == 몸무게면 번호가 더 작은 학생.

class Students :
    def __init__ (self, height, weight, number) :
        self.height = height;
        self.weight = weight;
        self.number = number;

N = int(input());

students = [];
number = 1;
for i in range(N) :
    height, weight = map(int, input().split());
    students.append(Students(height,weight,number));
    number += 1;

students.sort(key = lambda x : (-x.height, -x.weight, x.number));

for elem in students :
    print(elem.height, elem.weight, elem.number);
    