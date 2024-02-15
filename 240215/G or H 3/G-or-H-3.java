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
        int K = Integer.parseInt(st.nextToken());

        int arr[] = new int[10001];

        int maxIdx = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            char photo = st.nextToken().charAt(0);

            maxIdx = Math.max(num, maxIdx);

            if(photo == 'G'){
                arr[num-1] = 1;
            }else{
                arr[num-1] = 2;
            }
        }


        int max = Integer.MIN_VALUE;
        

        for(int i = 0; i < 10001-K; i++){
            int sum = 0;
            for(int j = i; j <= i+K; j++){
                sum += arr[j];
            }

            max = Math.max(sum, max);
        }


        sb.append(max);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }



}