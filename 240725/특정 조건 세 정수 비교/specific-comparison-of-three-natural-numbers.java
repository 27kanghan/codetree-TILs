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

        int min = Math.min(a,Math.min(b,c));


        if(a == min){
            System.out.print(1 + " ");
        }else{
            System.out.print(0 + " ");
        }

        if(a == b && a == c && b == c){
            System.out.print(1 + " ");
        }else{
            System.out.print(0 + " ");
        }

    }
}