import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a,b);
        int min = Math.min(a,b);

        boolean flags = false;
        int cnt = 1;

        while(true){

//            System.out.println(c);
            if(c <= max && min <= c){
                flags = true;
                break;
            }else if(c > max){
                break;
            }

            cnt++;

            c *= cnt;




        }

        if(flags){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}