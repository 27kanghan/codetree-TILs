import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = -1;
      for(int i = 0; i < 10; i++){

          int a = sc.nextInt();
          
          max = Math.max(max,a);
      
      
      }

        System.out.println(max);

    }
}
