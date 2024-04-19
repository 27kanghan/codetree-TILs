import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        String a = sc.next();

        int a = sc.nextInt();

        for(int i = 1 ; i <= a; i++){
            if(i % 2 == 0 || i % 3 == 0){
                System.out.print(1 + " ");
            }else{
                System.out.print(0 + " ");
            }
        }

    }
}