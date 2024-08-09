import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();
        
        if(year % 100 == 0 && year % 400 != 0){
            System.out.println("false");
        }else if(year % 4 == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
       

    }
}