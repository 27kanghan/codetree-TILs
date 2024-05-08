import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//

        double arr[] = new double[10];
//        String str[] = new String[10];
        
        int n = sc.nextInt();

        double sum = 0;
        double avg = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum+= arr[i];
        }
        
        
        
        avg = sum / n;

                System.out.printf("%.1f\n",avg);

        
        if(avg >= 4.0){
            System.out.println("Perfect");
        }else if(avg >= 3.0){
            System.out.printf("Good");
        }else{
            System.out.println("Poor");
        }
        
    }
}