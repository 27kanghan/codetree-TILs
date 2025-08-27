class Student :
    def __init__ (self, name, height, weight) :
        self.name = name;
        self.height = height;
        self.weight = weight;

n = int(input());

students = [];

for i in range(n) :
    name, height, weight = tuple(input().split());

    height = int(height);
    weight = int(weight);

    students.append(Student(name,height,weight));


students.sort(key = lambda x : (x.height, -x.weight));


for elem in students :
    print(elem.name, elem.height, elem.weight);