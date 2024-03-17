import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
         double c = sc.nextDouble();

        int d = (int) (a+b+c);
        double e = (a+b+c)/3;


        System.out.println(d);
        System.out.printf("%.0f", e);

    }
}