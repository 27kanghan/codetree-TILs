import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//

        int arr[] = new int[10];
        int sum2 = 0;
        double sum3 = 0;
        double cnt = 0;
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if((i+1) % 2 == 0){
                sum2 += arr[i];
            }else if((i+1) % 3 == 0){
                sum3 += arr[i];
                cnt++;
            }

        }

        System.out.printf("%d %.1f", sum2, sum3/cnt);


    }
}