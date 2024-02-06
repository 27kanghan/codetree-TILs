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
        int cnt = 0;
        for(int i = 0; i < N; i++){
            if(i == 0 || arr[i] == arr[i-1]){
                cnt++;
            }else{
                cnt = 1;
            }

            max = Math.max(max, cnt);
        }


        sb.append(max);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


}