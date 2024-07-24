import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();

        int arr[] = new int[10];

        int sum = 0;
        while(true){

            // System.out.println(a);
            // System.out.println("나머지" + a % b);

            arr[a % b]++;
            if(a / b <= 1){
                break;
            }



            cnt++;

            a /= b;


        }

        // System.out.println(Arrays.toString(arr));

        for(int i = 0; i < 10; i++){
            // System.out.println(Math.pow(arr[i],2));
            if(arr[i] != 0) {
                sum += Math.pow(arr[i], 2);
            }
        }

        System.out.println(sum);


    }
}
