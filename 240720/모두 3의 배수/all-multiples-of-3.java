import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
        boolean flags = true;
        
        for(int i = 0; i < 5; i++){
            int a = sc.nextInt();
            
            if(a % 3 != 0){
                flags = false;
            }
        }
        
        if(flags){
            System.out.println(1);
        }else{
            System.out.println(0);
        }


    }
}