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
            
            if(num % 2 == 0){
                num /= 2;
            }else{
                num = num * 3 + 1;
            }
            
            cnt++;

        }

        System.out.println(cnt);
    }
}