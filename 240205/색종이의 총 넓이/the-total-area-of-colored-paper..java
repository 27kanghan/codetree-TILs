import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[2001][2001];
        int cnt = 0;

        int idx = 1000;

        for (int k = 0; k < N; k++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = x1 + 8;
            int y2 = y1 + 8;


            for (int i = idx + y1; i < idx + y2; i++) {
                for (int j = idx + x1; j < idx + x2; j++) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                if (arr[i][j] == 1) {
                    cnt++;
                }
            }
        }


        sb.append(cnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }


}