class User :
    def __init__ (self, user_Id = "codetree", level=10):
        self.u = user_Id;
        self.l = level;


user_id, level = input().split();

level = int(level);

user1 = User();

print(f"user {user1.u} lv {user1.l}")

user2 = User(user_id, level)

print(f"user {user2.u} lv {user2.l}")

