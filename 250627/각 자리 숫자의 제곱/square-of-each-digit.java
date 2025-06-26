import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.


        System.out.println(pow(n));
    }

    public static int pow(int n){
        if(n < 10) {
            return (int)Math.pow(n,2);
        }

        return pow(n/10) + (int)Math.pow(n%10,2);
    }
}