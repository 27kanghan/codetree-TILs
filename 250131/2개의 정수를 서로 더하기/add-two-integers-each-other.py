c = input();

arr = c.split();

a = int(arr[0]);
b = int(arr[1]);

temp = a;

a+=b;

b+=a;

print(f"{a} {b}");