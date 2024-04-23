import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        for(int i = 1; i <= Integer.parseInt(a); i++){
            
            String b = String.valueOf(i);
            
            if(i % 3 == 0 || b.contains("3") || b.contains("6") || b.contains("9")){
                System.out.print(0 + " ");
            }
            else{
                System.out.print(i + " ");
            }
        }


    }
}