import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//

        int arr[] = new int[10];

        int sum0 = 0;
        int sum1 = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if((i+1) % 2 == 0){
                sum0+=arr[i];
            }else{
                sum1 += arr[i];
            }
        }

        int max = Math.max(sum0, sum1);
        int min = Math.min(sum0, sum1);


        System.out.println(max - min);





    }
}