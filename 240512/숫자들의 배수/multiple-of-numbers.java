import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
        int n = sc.nextInt();
        int arr[] = new int[n];

        int ans = 0;
        int cnt = 1;

        while (true) {


            System.out.print(n*cnt + " ");

            if((n*cnt) % 5 == 0){
                ans++;
            }

            if(ans == 2){
                break;
            }

            cnt++;




        }


    }
}