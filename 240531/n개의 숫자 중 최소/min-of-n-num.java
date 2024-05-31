import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int n = sc.nextInt();
        int cnt = 0;
        int arr[] = new int[n];
      for(int i = 0; i < n; i++){

          arr[i] = sc.nextInt();

         min = Math.min(arr[i],min);
      }

      for(int i = 0; i < n; i++){
          if(arr[i] == min){
              cnt++;
          }
      }

        System.out.println(min + " " + cnt);

    }
}