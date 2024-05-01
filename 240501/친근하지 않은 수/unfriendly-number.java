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

        int cnt = 0;

        for(int i = 1; i <= a; i++){
            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}