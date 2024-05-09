import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//

        int N = sc.nextInt();
        int ans = 0;

        for(int i = 0; i < N; i++){
            int arr[] = new int[4];
            for(int j = 0; j < 4; j++){
                arr[j] = sc.nextInt();
            }


            double sum = 0;
            double avg = 0;

            for(int j = 0; j < 4; j++){
                sum += arr[j];
            }

//            System.out.println(sum);

            avg = sum/(double)4;

//            System.out.println(avg);

            if(avg >= 60){
                System.out.println("pass");
                ans++;
            }else{
                System.out.println("fail");
            }

        }

        System.out.println(ans);

    }
}