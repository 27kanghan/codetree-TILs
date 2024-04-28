import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int big = Math.max(a,b);
        int small = Math.min(a,b);
        
        int sum = 0;
        

        for (int i = small; i <= big; i++) {
            if (i % 5 == 0){
                sum+=i;
            }
        }

        System.out.println(sum);
    }
}