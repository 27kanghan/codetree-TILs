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

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                int sum = 0;
                for(int k = 0; k < N; k++){
                    if(k == i || k == j) continue;
                    sum += arr[k];

                }

                min = Math.min(min, (Math.abs(sum-S)));

            }
        }



        sb.append(min);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


    private static boolean inRange(int nr, int nc, int N, int M) {
        return nr >= 0 && nr < N && nc >= 0 && nc < M;
    }


}