import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // 문자열 입력
        double a = sc.nextDouble();
                double b = sc.nextDouble();

        System.out.println(s);
        System.out.printf("%.2f\n", a);
         System.out.printf("%.2f", b);
    }
}