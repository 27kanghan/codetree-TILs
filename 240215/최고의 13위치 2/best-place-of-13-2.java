import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int dr[] = {1, 0, -1, 0, 1, -1, 1, -1};
    static int dc[] = {0, 1, 0, -1, 1, 1, -1, -1};

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int arr[][] = new int[N][N];

        for(int i = 0; i < N; i ++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N-2; j++){
                for(int n = 0; n < N; n++){
                    for(int m = 0; m < N-2; m++){
                        if(i == n && Math.abs(m-j) <= 2){
                            continue;
                        }

                        int cnt1 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                        int cnt2 = arr[n][m] + arr[n][m+1] + arr[n][m+2];

                        max = Math.max(cnt1+cnt2, max);


                    }
                }
            }
        }
        sb.append(max);


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


    private static boolean inRange(int nr, int nc, int N, int M) {
        return nr >= 0 && nr < N && nc >= 0 && nc < M;
    }


}