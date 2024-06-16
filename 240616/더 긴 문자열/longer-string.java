import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

       String src = sc.next();
       String src2 = sc.next();

       if(src.length() > src2.length()){
           System.out.println(src + " " + src.length());
       }else if(src2.length() > src.length()){
           System.out.println(src2 + " "  + src2.length());

       }else{
           System.out.println("same");
       }

    }
}