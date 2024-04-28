import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int big = Math.max(a,b);
//        int small = Math.min(a,b);

        double sum = 0;
        double cnt = 0;


        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if(a >= 0 && a <= 200) {
                sum += a;
                cnt++;
            }
        }


        double avg = sum / cnt;

        System.out.print((int)sum + " ");
        System.out.printf("%.1f", avg);

    }
}