import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//

        double sum = 0;

        double cnt = 0;
        double avg = 0;

        while(true){

            int a= sc.nextInt();

            sum+=a;

            cnt++;

            if(a >= 30 || a < 20){
                sum -= a;
                cnt--;

                avg = sum / cnt;

                break;
            }


        }

        System.out.printf("%.2f", avg);
    }
}