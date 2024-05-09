import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//

        int arr[] = new int[100];

        int sum = 0;
        int idx = 0;

        while(true){
            int a = sc.nextInt();

            if(a == 0){
                break;
            }


            arr[idx] = a;

            idx++;

        }

        for(int i = idx-3; i < idx; i++){
            sum += arr[i];
        }

        System.out.println(sum);


    }
}