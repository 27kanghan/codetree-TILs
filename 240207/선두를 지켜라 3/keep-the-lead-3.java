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

        int a[] = new int[1000 * 1000 + 1];
        int b[] = new int[1000 * 1000 + 1];
        int totalTime = 0;

        int aIdx = 0;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            totalTime += t;

            for(int j = 1; j <= t; j++){
                a[aIdx+j] = a[aIdx+j-1] + v;
            }
            aIdx += t;

        }
        int bIdx = 0;
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for(int j = bIdx; j < bIdx+t; j++){
                b[j+1] = b[j] + v;
            }

            bIdx+=t;
        }


        int leader = 0;
        int cnt = 0;

        for(int i = 1; i < totalTime; i++){
            if(a[i] == b[i]){
                if(leader != 3)
                cnt++;

                leader = 3;
            }
            else if(a[i] > b[i] ){
                if(leader != 1){
                    cnt++;
                }
                leader = 1;
            }
            else if(a[i] < b[i]){
                if(leader != 2){
                    cnt++;
                }
                leader = 2;
            }
        }


        sb.append(cnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


}