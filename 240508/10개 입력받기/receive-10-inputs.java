import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//

        int arr[] = new int[10];
//        String str[] = new String[10];

//        int n = sc.nextInt();

        double cnt = 0;

        double sum = 0;
        double avg = 0;

        Arrays.fill(arr,-1);

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if(a == 0) break;
            arr[i] = a;
            cnt++;

        }


        for (int i = 0; i < cnt; i++) {
            sum+=arr[i];
        }

        avg = sum / cnt;

        System.out.printf("%d %.1f", (int)sum, avg);

//        if(avg >= 4.0){
//            System.out.println("Perfect");
//        }else if(avg >= 3.0){
//            System.out.printf("Good");
//        }else{
//            System.out.println("Poor");
//        }

    }
}