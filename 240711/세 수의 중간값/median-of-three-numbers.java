import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();

       if(b > a && b < c){
           System.out.println(1);
       }else{
           System.out.println(0);
       }
    }
}