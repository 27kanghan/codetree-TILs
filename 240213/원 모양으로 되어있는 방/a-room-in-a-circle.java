import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){
            int sum = 0;
            int cnt = i;
            for(int j = 0; j < N; j++){
                if(cnt == N){
                    cnt = 0;
                }
                sum += j * arr[cnt];

                cnt++;
            }

            min = Math.min(min, sum);
        }

        sb.append(min);



        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}