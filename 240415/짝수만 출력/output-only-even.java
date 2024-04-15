import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
//
//        int a = 1;
        while(true){
            if(a>b) break;

            if(a % 2 == 0) System.out.print(a + " ");

            a++;
        }
    }
}