import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();

        int arr[][] = new int[K][N];

        for (int i = 0; i<K; i++){
            for (int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = 0;

        for(int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                if(i == j) continue;

                // 첫 번째 줄 불러와서
                int idxI = -1;
                int idxJ = -1;

                boolean flags = true;
                for (int a = 0; a < K; a++){
                    for (int k = 0; k < N; k++) {
                        if(arr[a][k] == i) idxI = k;
                        if(arr[a][k] == j) idxJ = k; 
                        
                    }
                    if (idxI < idxJ) flags = false; 
                    
                }

            if (flags) answer++;
                
            }

        }

        System.out.println(answer);


    }
}