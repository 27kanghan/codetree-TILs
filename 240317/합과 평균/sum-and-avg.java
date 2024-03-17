import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        int c = (int) (a+b);
        double d = (a+b)/2;


        System.out.print(c + " ");
        System.out.printf("%.1f", d);

    }
}