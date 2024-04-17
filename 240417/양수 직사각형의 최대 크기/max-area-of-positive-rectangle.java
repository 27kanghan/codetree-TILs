import java.io.*;

import java.sql.Array;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int arr[][];

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean isPossible = false;
        int max = -1;

        for (int x1 = 0; x1 < N; x1++) {
            for (int y1 = 0; y1 < N; y1++) {
                for (int x2 = 0; x2 < N; x2++) {
                    for (int y2 = 0; y2 < N; y2++) {
//                        System.out.println("size" + x1 + " " + y1 + " " + x2 + " " + y2);
                        max = Math.max(max, getSize(x1, y1, x2, y2));
                    }
                }

            }
        }

        sb.append(max);


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static int getSize(int x1, int y1, int x2, int y2) {

        int size = 0;

        if (isPositive(x1, y1, x2, y2)) {
            for(int i = y1; i <= y2; i++){
                for(int j = x1; j <= x2; j++){
                    size++;
                }
            }
        }

        return size;
    }

    private static boolean isPositive(int x1, int y1, int x2, int y2) {


        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
//                System.out.print(arr[i][j] + " ");
                if (arr[i][j] <= 0){
                    return false;
                }
            }
//            System.out.println();
        }
        return true;
    }


}