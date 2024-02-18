import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int arr[] = new int [6];
    public static void main(String[] args) throws IOException {


        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int q = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());


        int cnt = 0;
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                for(int k = 1; k <=N; k++){
                    if(((Math.abs(i-a) <= 2 || Math.abs(N+a-i) <= 2)
                    && (Math.abs(j-b) <= 2 || Math.abs(N-j+b) <= 2) &&
                            (Math.abs(k-c) <= 2 || Math.abs(N-k+c) <= 2))
                    || ((Math.abs(i-q) <= 2 || Math.abs(N-i+q) <= 2) &&
                            (Math.abs(j-w) <= 2 || Math.abs(N-j+w) <= 2) &&
                            (Math.abs(k-e) <= 2 || Math.abs(N-k+e) <= 2)))
                    {
                                cnt++;
                    }
                }
            }
        }

        sb.append(cnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }




}