import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = isPrime(a, b);


        System.out.println(sum);

    }

    //
    private static int isPrime(int a, int b) {
        int sum = 0;

        for(int i = a; i <= b; i++)
        {
            int ct = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    ct++;
                }
            }
            if(ct == 2) {
                sum+=i;
            }
        }
        return sum;
    }
}
