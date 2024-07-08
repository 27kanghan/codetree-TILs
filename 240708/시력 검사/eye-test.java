import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double l = sc.nextDouble();
        
        if(r >= 1.0 && l >= 1.0){
            System.out.println("High");
        }else if(r >= 0.5 && l >= 0.5){
            System.out.println("Middle");
        }else{
            System.out.println("Low");
        }
    }
}