import java.io.*;

import java.sql.Array;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

        int arr[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        int max = Integer.MIN_VALUE;
        for (int k = 0; k <= N; k++) {


            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    max = Math.max(max,getCost(N, M, arr, i, j, k));
                }
            }

        }

        sb.append(max);


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int getCost(int n, int m, int[][] arr, int i, int j, int k) {
        int cost = k * k + (k+1) * (k+1);
        int goldCost = 0;
        int goldCount = 0;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (Math.abs(r - i) + Math.abs(c - j) <= k) {
                    if (inRange(r, c, n) && arr[r][c] == 1) {
                        goldCost += m;
                        goldCount++;
                    }
                }
            }
        }

//
//        System.out.println("좌표 " + i + " " + j + "k는" + k);
//        System.out.println(cost + " " + goldCost + " 갯수" + goldCount);
        if(goldCost - cost >= 0){
//            System.out.println("손해안봄");
            return goldCount;
        }

        return 0;
    }

    private static boolean inRange(int r, int c, int n) {
        return r >= 0 && r < n && c >= 0 && c < n;
    }


}