import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int arr[] = new int[a];

        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }

        int min = 99999;

        for(int i = 0; i < a; i++){
            for(int j = i+1; j < a; j++){
                min = Math.min(Math.abs(arr[i]-arr[j]), min);
            }
        }

        System.out.println(min);

    }
}