import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int dr[] = {1, 0, -1, 0};
    static int dc[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[][] = new int[N][N];

        for (int i = 0; i < M; i++) {
            int cnt = 0;
            st = new StringTokenizer(br.readLine());

            int r = Integer.parseInt(st.nextToken())-1;
            int c = Integer.parseInt(st.nextToken())-1;

            arr[r][c] = 1;

            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];
                if(inRange(nr, nc, N)) {
                    if(arr[nr][nc] == 1){
                        cnt++;
                    }
                }
            }

            if(cnt == 3){
                sb.append(1);
                sb.append("\n");
            }else{
                sb.append(0);
                sb.append("\n");
            }

        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


    private static boolean inRange(int r, int c, int N) {
        return r >= 0 && r < N && c >= 0 && c < N;
    }


}