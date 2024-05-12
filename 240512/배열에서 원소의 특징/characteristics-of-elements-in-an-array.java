import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//

       int arr[] = new int[10];

       int idx = 0;
       for(int i = 0; i < 10; i++){
           arr[i] = sc.nextInt();
           if(arr[i] % 3 == 0){
               idx = i;
               break;
           }
       }

        System.out.println(arr[idx-1]);







    }
}