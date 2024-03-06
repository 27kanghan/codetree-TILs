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

        int arr[] = new int[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int res = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                for(int k = i; k < j; k++){
                    min = Math.min(min, arr[k]);
                    max = Math.max(max, arr[k]);
                }

                if(max - min <= K){
                    res = Math.max(res, j-i);
                }
            }

        }

        sb.append(res);

        bw.write(sb.toString());
        bw.flush();
        bw.close();




    }
}