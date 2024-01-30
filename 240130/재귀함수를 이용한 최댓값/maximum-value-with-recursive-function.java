import java.io.*;

import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int max;

    static int arr[];

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        max = Integer.MIN_VALUE;

        arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        max = F(N);

        sb.append(max);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static int F(int n) {

        if(n == 0){
            return arr[n];
        }

        return Math.max(arr[n-1], F(n-1));

    }


}