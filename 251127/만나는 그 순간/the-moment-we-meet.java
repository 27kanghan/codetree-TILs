import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int time_A[] = new int[1001];
        int time_B[] = new int[1001];

        int start = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int totalTime = 0;
        int time = 0;

        for(int i = 0; i < N; i++){

            String d = sc.next();
            int t  = sc.nextInt();
            totalTime += t;
            
            

            for (int j = time; j < time+t; j++){
                if(d.equals("R")) {

                    time_A[j] = ++start;
                }
                else {

                    time_A[j] = --start;
                }
            
            }
            time+=t;
        }
      
        start = 0;
        time = 0;
        for(int i = 0; i < M; i++){

            String d = sc.next();
            int t  = sc.nextInt();
            

            

            for (int j = time; j < time+t; j++){
                if(d.equals("R")) {
                    time_B[j] = ++start;
                }
                else {
                    time_B[j] = --start;
                }

            }
            time+=t;
        }
    
        // System.out.println(totalTime);
        int answer = -1;
        for(int i = 0; i < totalTime; i++){
            // System.out.print(time_A[i]);
            if(time_A[i] == time_B[i]){
                
                answer = i;
                break;
            }
        }
        if(answer != -1) answer +=1;
        System.out.println(answer);

    }
}
