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

        int sum = 0;
        int res = 0;

        for(int i = 1; i <= 100; i++){
            sum += i;
            if(sum >= a){
                res = i;
                System.out.println(res);
                break;
            }

        }

//        System.out.println(cnt);
    }
}