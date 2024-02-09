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

        char arr[][] = new char[N][M];

        char num = 65;

        arr[0][0] = num++;


        int cnt = N * M -1 ;

        int r = 0;
        int c = 0;
        int d = 0;

        while(cnt > 0){


            if(num > 90){
                num = 65;
            }
            int nr = r + dr[d % 4];
            int nc = c + dc[d % 4];


            if(!inRange(nr,nc,N,M) || arr[nr][nc] != 0){
                d++;
                continue;
            }

            arr[nr][nc] = num++;
            r = nr;
            c = nc;
            cnt--;

        }

        for(int i = 0; i < N; i ++){
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

    private static boolean inRange(int r, int c, int n, int m) {
        return r >= 0 && r < n && c >= 0 && c < m;
    }


}