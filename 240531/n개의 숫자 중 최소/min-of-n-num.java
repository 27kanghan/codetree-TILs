import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int n = sc.nextInt();
        int cnt = 0;
      for(int i = 0; i < n; i++){

          int a = sc.nextInt();

          if(min > a){
              cnt++;
              min = a;
          }
      }

        System.out.println(min + " " + cnt);

    }
}