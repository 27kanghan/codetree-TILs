class Students :
    def __init__(self, name, height, weight) :
        self.name = name;
        self.height = height;
        self.weight = weight;
    


n = int(input());

students = []

for _ in range(n) :
    name, height, weight = tuple(input().split());
    students.append(Students(name, int(height),int(weight)));

students.sort(key = lambda x: x.height)


for elem in students :
    print(elem.name, elem.height, elem.weight)



