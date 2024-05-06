import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//

        int cnt = 0;

        int num = sc.nextInt();

        while(true){
            if(num >= 1000) {
                break;
            }

            if(num % 2 == 0){
                num = num * 3 +1 ;
            }else{
                num = num * 2 + 2;
            }

            cnt++;

        }

        System.out.println(cnt);
    }
}