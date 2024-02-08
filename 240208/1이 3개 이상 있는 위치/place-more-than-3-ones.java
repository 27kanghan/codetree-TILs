import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int dr [] = {1,0,-1,0};
    static int dc [] = {0,1,0,-1};
    public static void main(String[] args) throws IOException {



        int N = Integer.parseInt(br.readLine());

        int arr[][] = new int [N][N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }



        int res = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                int cnt = 0;
                int r = i;
                int c = j;
                for(int d = 0; d < 4; d++) {
                    int nr = r + dr[d];
                    int nc = c + dc[d];
                    if (!inRange(nr, nc, N)) {
                        continue;
                    }
                    if (valid(nr, nc, arr)) {
                        cnt++;
                    }
                }
                if(cnt >= 3){
                    res++;
                }
            }
        }

        sb.append(res);



        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean valid(int r, int c, int arr[][]) {
        return arr[r][c] == 1;
    }

    private static boolean inRange(int r, int c, int N) {
        return  r >= 0 &&  r < N && c >= 0 && c < N;
    }


}