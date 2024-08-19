import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 1; i<= a; i++){
            if(i % 2 == 0) {
                continue;
            }
            if(i % 3 == 0 && i % 9 != 0) {
                continue;
            }
            if(i % 10 == 5){
                continue;
            }

            System.out.print(i+ " ");

        }
    }
}