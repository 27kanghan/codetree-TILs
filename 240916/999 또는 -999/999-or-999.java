import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min = 0;
        
        while(true){
            int a = sc.nextInt();
            
            if(a == 999 || a == -999) break;
            
            max = Math.max(a, max);
            min = Math.min(a, min);
            
        }

        System.out.println(max + " " + min);

    }
}