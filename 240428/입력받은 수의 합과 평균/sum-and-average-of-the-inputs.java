import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
        int n = sc.nextInt();
//        int b = sc.nextInt();
//
//        int big = Math.max(a,b);
//        int small = Math.min(a,b);

        double sum = 0;
        double cnt = 0;


       for(int i = 0; i < n; i++){
           int a = sc.nextInt();

           sum+=a;

       }

        System.out.printf("%d %.1f", (int)sum, sum/n);
    }
}