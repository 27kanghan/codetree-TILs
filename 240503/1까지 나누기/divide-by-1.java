import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
        int a= sc.nextInt();
//        int b = sc.nextInt();
//
//        int big = Math.max(a,b);
//        int small = Math.min(a,b);

        int sum = 1;
        int res = 0;
        int cnt = 0;

        for(int i = 1; i <= 100; i++){
            a /= i;
            cnt++;
            if(a <= 1){
                System.out.println(cnt);
                break;
            }

        }

//        System.out.println(cnt);
    }
}