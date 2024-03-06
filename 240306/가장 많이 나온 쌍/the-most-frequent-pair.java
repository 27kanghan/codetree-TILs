import java.io.*;

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

        int arr[][] = new int[N+1][N+1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arr[r][c]++;
        }

//        for(int i = 0; i < N+1; i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }
        int cnt = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 1; i <= N; i++){
            cnt = 0;
            for(int j = i; j <= N; j++){
                cnt = 0;
                if(i != j ) {
//                    System.out.println(i+ "  " + j);
                    cnt = arr[i][j] + arr[j][i];

                }
//                System.out.println(cnt);
                max = Math.max(max,cnt);

            }

        }
        sb.append(max);

        bw.write(sb.toString());
        bw.flush();
        bw.close();



    }
}