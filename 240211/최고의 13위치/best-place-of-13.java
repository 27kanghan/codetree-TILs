import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int arr[][] = new int[N][N];

        int cnt = 0;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N-2; j++){sum = 0;
                for(int k = j; k < j+3; k++){
                    
                    sum += arr[i][k];
                }
                max = Math.max(max,sum);
            }
        }

        sb.append(max);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}