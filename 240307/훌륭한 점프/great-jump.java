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

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int minMax = Integer.MAX_VALUE;

        for(int i = Math.max(arr[0], arr[N-1]); i <= N; i++){
            if(valid(N,K,i,arr)) {
                minMax = Math.min(minMax, i);
            }
        }

        sb.append(minMax);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static boolean valid(int n, int k, int i, int[] arr) {
        // System.out.println(i);

        int available[] = new int[n];
        int cnt = 0;

        for(int a = 0; a < n; a++){
            if(arr[a] <= i){
                available[cnt++] = a;
            }
        }

//        System.out.println(Arrays.toString(available));

        for(int a = 1; a < cnt; a++){
            int distance = available[a] - available[a-1];

            if(distance > k){
//                System.out.println(false);
                return false;
            }
        }

//        System.out.println(true);
        return true;



    }
}