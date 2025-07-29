class Student :
    def __init__ (self, name, score) :
        self.name = name;
        self.score = score;


students = []

for _ in range(5) :
    name, score = tuple(map(str, input().split()));
    score = int(score);
    students.append(Student(name,score));

# students = sorted(students);

min_val = 9999999;
min_idx = 0;
for i in range(5) :
    if min_val > students[i].score :
        min_idx = i;
        min_val = students[i].score;


print(students[min_idx].name ,students[min_idx].score)





#  class Student:
#     def __init__(self, kor=0, eng=0, math=0):
#         self.kor = kor
#         self.eng = eng
#         self.math = math

# students = []
# for _ in range(5):
#     kor, eng, math = tuple(map(int, input().split()))
#     students.append(Student(kor, eng, math))

# student3 = students[2] # 세 번째 학생 정보
# print("student3:", student3.kor, student3.eng, student3.math)

# >> 90 80 90
#    20 80 80
#    90 30 60
#    60 10 50
#    80 20 10

# student3: 90 30 60
   