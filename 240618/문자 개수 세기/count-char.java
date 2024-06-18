import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String src = sc.nextLine();
        String src2 = sc.next();
        int cnt = 0;
       for(int i = 0; i < src.length(); i++){
           if(src.charAt(i) == src2.charAt(0)){
               cnt++;
           }
       }

        System.out.println(cnt);

    }
}