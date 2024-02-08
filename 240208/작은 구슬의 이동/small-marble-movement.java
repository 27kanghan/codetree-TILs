import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int dr[] = {1, -1, 0, 0};
    static int dc[] = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {


        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int T = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken())-1;

        int c = Integer.parseInt(st.nextToken())-1;

        char dir = st.nextToken().charAt(0);

        int d = 0;
        int nr = 0;
        int nc = 0;

        for (int k = 0; k < T; k++) {

            if (dir == 'U') {
                d = 0;
                nr = r + dr[d];
                nc = c + dc[d];
                if (inRange(nr, nc, N)) {
                    r = nr;
                    c = nc;
                }else {
                    dir = 'D';
                    d++;
                }
            } else if (dir == 'D') {
                d = 1;
                nr = r + dr[d];
                nc = c + dc[d];
                if (inRange(nr, nc, N)) {
                    r = nr;
                    c = nc;
                }else {
                    dir = 'U';
                    d--;
                }
            } else if (dir == 'R') {
                d = 2;
                nr = r + dr[d];
                nc = c + dc[d];
                if (inRange(nr, nc, N)) {
                    r = nr;
                    c = nc;
                }else {
                    dir = 'L';
                    d++;
                }
            } else if (dir == 'L') {
                d = 3;
                nr = r + dr[d];
                nc = c + dc[d];
                if (inRange(nr, nc, N)) {
                    r = nr;
                    c = nc;
                }else {
                    dir = 'R';
                    d--;
                }
            }



        }


        sb.append(r+1);
        sb.append(" ");
        sb.append(c+1);


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


    private static boolean inRange(int r, int c, int N) {
        return r >= 0 && r < N && c >= 0 && c < N;
    }


}