import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[10];

        Arrays.fill(arr,-1);

        arr[0] = n;

        arr[1] = m;

        for(int i = 2; i < 10; i++){
            arr[i] = 2*arr[i-2] + arr[i-1];
        }

        for(int i = 0; i < 10; i++){
            if(arr[i] != -1){
                System.out.print(arr[i] + " ");
            }
        }




    }
}