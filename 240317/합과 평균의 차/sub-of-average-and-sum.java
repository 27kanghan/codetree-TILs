import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
         double c = sc.nextDouble();

        int d = (int) (a+b+c);
        int e = (int)((a+b+c)/3);
        int f = d-e;


        System.out.println(d);
        System.out.println(e);
          System.out.println(f);
        

    }
}