import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int plusCnt = 0;
        int minusCnt = 0;
        for(int i = 0; i < N; i++){
            if(i == 0 || arr[i] >= 0 ){
                plusCnt++;
                minusCnt = 0;
            }else if(i == 0 || arr[i] < 0){
                minusCnt++;
                plusCnt = 0;
            }
            

            max = Math.max(max, Math.max(minusCnt, plusCnt));
        }


        sb.append(max);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


}