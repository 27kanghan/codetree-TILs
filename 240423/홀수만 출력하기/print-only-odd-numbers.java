import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 2 != 0) {
                System.out.println(arr[i]);
                arr[i] = -1;
            }
        }
        
        
        
        


    }
}