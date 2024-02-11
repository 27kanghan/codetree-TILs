import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {


        int N = Integer.parseInt(br.readLine());


        st = new StringTokenizer(br.readLine());

        int arr[] = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum = calculateDistance(i, min, N, arr);

            min = Math.min(min, sum);
        }



        sb.append(min);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int calculateDistance(int idx, int min, int N, int[] arr) {

        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += arr[i] * Math.abs(idx - i);
        }

        return sum;
    }


}