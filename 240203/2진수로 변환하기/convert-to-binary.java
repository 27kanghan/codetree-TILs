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

        int cnt = 0;

        while(N > 2) {

            arr[cnt++] = N % 2;
            N = N/2;

        }
        arr[cnt] = N;

        for(int i = cnt; i >= 0; i--) {
            sb.append(arr[i]);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }


}