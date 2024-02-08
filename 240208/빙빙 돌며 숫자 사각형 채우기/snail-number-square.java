import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int dr[] = {0, 1, 0, -1};
    static int dc[] = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {


        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

        int arr[][] = new int[N][M];


        int d = 0;
        int r = 0;
        int c = 0;

        int cnt = N * M-1;
        int num = 1;
        arr[0][0] = num;

        while(cnt > 0) {
            int nr = r + dr[d % 4];
            int nc = c + dc[d % 4];

            if (!inRange(nr, nc, N, M) || arr[nr][nc] != 0) {
                d++;
                continue;
            }
            arr[nr][nc] = ++num;
            cnt--;

            r = nr;
            c = nc;
            
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                sb.append(arr[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


    private static boolean inRange(int r, int c, int N, int M) {
        return r >= 0 && r < N && c >= 0 && c < M;
    }


}