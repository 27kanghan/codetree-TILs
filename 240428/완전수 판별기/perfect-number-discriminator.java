import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int big = Math.max(a,b);
//        int small = Math.min(a,b);

        double sum = 0;
        double cnt = 0;


        for(int i = 1; i <= a/2; i++){
            if(a % i == 0) sum+=i;
        }
        
        if(sum == a) System.out.println("P");
        else System.out.println("N");
    }
}