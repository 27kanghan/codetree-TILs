import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int arr[] = new int [N+1];

        for(int i = 0; i < K; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for(int j = a; j <= b; j++){
                arr[j]++;
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            max = Math.max(arr[i], max);
        }


        sb.append(max);

        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }


}