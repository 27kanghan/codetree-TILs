import java.io.*;

import java.sql.Array;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    static int dr[] = {-1, 0, 1, 0, 0, 1, -1, 0, -1, 1, 0, 0};
    static int dc[] = {0, 1, 0, 1, -1, 0, 0, -1, 0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[][] = new int[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        int max = Integer.MIN_VALUE;

        for(int d = 0; d < 12; d+=2){


            for(int r = 0; r < N; r++){
                for(int c = 0; c < M; c++){


                    int nr1 = r + dr[d];
                    int nc1 = c + dc[d];

                    if(!inRange(N,M,nr1,nc1)){
                        continue;
                    }

                    int nr2 = r + dr[d+1];
                    int nc2 = c + dc[d+1];


                    if(!inRange(N,M,nr2,nc2)){
                        continue;
                    }


                    int sum = arr[nr1][nc1] + arr[nr2][nc2] + arr[r][c];
//                    System.out.println("r+c+d = " +  r + " " + c + " " + d);
//                    System.out.println("nr+nc+d = " +  nr1 + " " + nc1 + " " + nr2 + " " + nc2);
//                    System.out.println(arr[nr1][nc1] +  " " + arr[nr2][nc2] + " " + arr[r][c]);
//                    System.out.println("sum" + sum);

                    max = Math.max(sum, max);
                }
            }


        }

        sb.append(max);





        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean inRange(int n, int m, int nr, int nc) {
        return nr >= 0 && nr < n && nc >=0 && nc < m;
    }

}