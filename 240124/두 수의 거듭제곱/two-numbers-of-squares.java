import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = pow(a, b);


            System.out.println(sum);

        }

        private static int pow(int a, int b) {
            return (int)Math.pow(a,b);
        }
    }