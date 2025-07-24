class Agent :
    def __init__(self, code, point, time) :
        self.code = code;
        self.point = point;
        self.time = time;


code, point, time = input().split();

# print(code, point, time);

agent1 = Agent(code, point, time);

print("secret code :", agent1.code)
print("meeting point :", agent1.point)
print("time :", agent1.time)