n = int(input())

# Please write your code here.

def printHelloWorld(n) :
    if n == 0 :
        return;

    printHelloWorld(n-1);
    print("HelloWorld")

printHelloWorld(n);