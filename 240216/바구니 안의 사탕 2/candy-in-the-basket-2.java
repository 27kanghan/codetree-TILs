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

        //범위는 c-k ~ c+k. 일단 c는 K보다 커야함 그럼.

        int arr[] = new int[1001];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int candy = Integer.parseInt(st.nextToken());
            int basket = Integer.parseInt(st.nextToken());

            arr[basket] += candy;

        }

        //C는 k부터 몇까지? 범위는 i + (k * 2) 까지. i는 0부터. 1001-K까지.

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 1001 - (K*2); i++){

            int sum = 0;
            

            for(int j = i; j <= i + (K*2); j++){
                sum += arr[j];
            }

            max = Math.max(sum, max);

        }
        sb.append(max);
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }



}