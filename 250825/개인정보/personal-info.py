class Student :
    def __init__(self, name, height, weight):
        self.name = name;
        self.height = height;
        self.weight = weight;


students = []

for i in range(0,5) :
    name, height, weight = tuple(input().split());

    height = int(height);
    weight = float(weight);

    students.append(Student(name,height,weight));


students.sort(key = lambda x : (x.name));

print("name");
for e in students :
    print(e.name, e.height, e.weight)


students.sort(key = lambda x : (-x.height));

print()
print("height")
for e in students :
    print(e.name, e.height, e.weight)

