import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//

        int n = sc.nextInt();

        int arr[] = new int[1000];

        Arrays.fill(arr,-1);

        arr[0] = 1;

        arr[1] = n;

        for(int i = 2; i < 100; i++){
            arr[i] = arr[i-2] + arr[i-1];

            if(arr[i] > 100){
                break;
            }
        }

        for(int i = 0; i < 1000; i++){
            if(arr[i] != -1){
                System.out.print(arr[i] + " ");
            }
        }




    }
}