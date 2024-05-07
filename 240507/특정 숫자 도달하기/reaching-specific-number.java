import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//

        double arr[] = new double[10];
//        String str[] = new String[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextDouble();
        }


        double sum = 0;
        double avg = 0;
        double cnt = 0;

        for(int i = 0; i < 10; i++){
            if(arr[i] > 250){
               break;
            }
            sum += arr[i];
            cnt++;
        }
        avg = sum / cnt;


        System.out.printf("%d %.1f", (int)sum, avg);

    }
}