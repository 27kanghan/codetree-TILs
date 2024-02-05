import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int arr[][] = new int[201][201];
        int cnt = 0;

        int idx = 100;

        for(int k = 0; k < N; k++){
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int i = idx + y1; i < idx + y2; i++){
                for(int j = idx + x1; j < idx + x2; j++){
                    if(arr[i][j] == 0){
                        cnt++;
                    }
                    arr[i][j] = 1;

                }
            }
        }






        sb.append(cnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }



}