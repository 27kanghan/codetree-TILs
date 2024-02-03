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

        int arr[] = new int [201];

        int res = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cnt = 0;

            for(int j = a+100; j <= b+100; j++){
                arr[j]++;
                if(arr[j] > 1){
                    cnt++;
                }
            }

            if(cnt > 1){
                res++;
            }


        }



        sb.append(res);

        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }


}