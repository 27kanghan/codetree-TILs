import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    int z = i;
                    int y = j;
                    int x = k;

                    if(Math.abs(a - z ) <= 2 || Math.abs(b - y ) <= 2 || Math.abs(c - x ) <= 2){
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