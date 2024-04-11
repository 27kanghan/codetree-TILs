import java.io.*;

import java.sql.Array;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int dr[] = {-1, -1, 1, 1};
    static int dc[] = {1, -1, -1, 1};

    public static void main(String[] args) throws IOException {


        int N = Integer.parseInt(br.readLine());

        int arr[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

//
//                System.out.println("start");
//                System.out.println(i + " " + j);
                max = Math.max(max, getValue(N, arr ,i, j));

            }
        }

        sb.append(max);


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int getValue(int n, int[][] arr, int startr, int startc) {
        int r = startr;
        int c = startc;
        int d = 0;
        int sum = 0;

        sum += arr[r][c];

        boolean isVisited[][] = new boolean[n][n];

        while (true) {

            if(d >= 4){
                break;
            }

            int nr = r + dr[d];
            int nc = c + dc[d];

            if(!inRange(nr,nc,n) || isCorner(nr,nc,n) || isVisited[nr][nc]){
                d++;
                continue;
            }

//            System.out.println("nrnc");
//            System.out.println(nr + " " + nc+ "d" + d);

            if(d == 3 && nr == startr && nc == startc){
//                System.out.println("sum");
//                System.out.println(sum);
                return sum;
            }

            sum += arr[nr][nc];
            isVisited[nr][nc] = true;

            r = nr;
            c = nc;

        }

        return 0;


    }

    private static boolean isCorner(int nr, int nc, int n) {
        return (nr == 0 && nc == 0) || (nr == 0 && nc == n-1) || (nr == n-1 && nc == 0) || (nr == n-1 && nc == n-1);
    }

    private static boolean inRange(int nr, int nc, int n) {
        return nr >= 0 && nr < n && nc >= 0 && nc < n;
    }


}