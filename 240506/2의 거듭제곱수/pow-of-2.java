import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//

        int cnt = 0;

        int num = sc.nextInt();

        while(true){
            if(num == 1) {
                break;
            }

            num /= 2;

            cnt++;

        }

        System.out.println(cnt);
    }
}