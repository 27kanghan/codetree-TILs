import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        
        for(int i = 0; i < 3; i++){
            String str = sc.next();
            int temp = sc.nextInt();
            
            if(str.equals("Y") && temp >= 37){
                A++;
            }else if(str.equals("N") && temp >= 37){
                B++;
            }else if(str.equals("Y") && temp < 37){
                C++;
            }else{
                D++;
            }
            
        }

        System.out.println(A + " " + B + " " + C + " " + D + " " + (A >= 2 ? "E" : ""));

    }
}