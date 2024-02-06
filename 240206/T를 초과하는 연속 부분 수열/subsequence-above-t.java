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
        int T = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){

            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int plusCnt = 0;
        for(int i = 0; i < N; i++){
            if((i == 0 && arr[i] > T) || arr[i] > T && arr[i] > T && arr[i] > arr[i-1]  ){
                plusCnt++;
            }else {
                plusCnt = 0;
            }


            max = Math.max(max, plusCnt);
        }


        sb.append(max);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


}