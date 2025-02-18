n = float(input());

arr = list(map(float, input().split()));

avg = sum(arr)/n;

score = "";

if avg >= 4.0 :
    score = "Perfect";
elif avg >= 3.0 :
    score = "Good";
else :
    score = "Poor";

print(f"{avg:.1f}\n{score}");


