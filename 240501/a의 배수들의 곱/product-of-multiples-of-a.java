import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
        int a= sc.nextInt();
        int b = sc.nextInt();
//
//        int big = Math.max(a,b);
//        int small = Math.min(a,b);

        int multi = 1;

        for(int i = 1; i <= b; i++){
            if(i % a == 0){
                multi *= i;
            }
        }

        System.out.println(multi);
    }
}