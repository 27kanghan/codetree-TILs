import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int dr[] = {-1, 0, 1, 0};
    static int dc[] = {0, 1, 0, -1};


    public static void main(String[] args) throws IOException {


        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int arr[][] = new int[N][N];

        String str = br.readLine();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int r = N/2;
        int c = N/2;
        int d = 0;
        int sum = 0;
        sum+= arr[r][c];
        for (int i = 0; i < T; i++) {
            if (str.charAt(i) == 'F') {
                int nr = r + dr[d];
                int nc = c + dc[d];

                if(!inRange(nr,nc,N)){
                    continue;
                }
                sum += arr[nr][nc];

                r = nr;
                c = nc;

            }

            if(str.charAt(i) == 'R'){
                d = (d+1) % 4;
            }else if(str.charAt(i) == 'L'){
                d = (d+3) % 4;
            }
        }

        sb.append(sum);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean inRange(int r, int c, int n) {
        return r >= 0 && r < n && c >= 0 && c < n;
    }


}