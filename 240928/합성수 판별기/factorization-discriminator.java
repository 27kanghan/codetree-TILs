import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        boolean flags = false;
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                flags = true;
            }
            
        }
        
        if(flags){
            System.out.println("C");
        }else{
            System.out.println("N");
        }


    }
}