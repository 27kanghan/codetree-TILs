import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = "";
       for(int i = 0; i< n; i++){
           str += sc.next();
       }

        System.out.println(str);

    }
}