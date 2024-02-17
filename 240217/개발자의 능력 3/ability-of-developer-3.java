import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int arr[] = new int [6];
    public static void main(String[] args) throws IOException {



        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 6; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 6; i++){
            for(int j = i+1; j < 6; j++){
                for(int k = j+1; k<6; k++) {
                    min = Math.min(min, getDiff(i, j, k));
                }
            }
        }

        sb.append(min);
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static int getDiff(int i, int j, int z) {
        int sum1 = arr[i] + arr[j] + arr[z];
        int sum2 = 0;

        for (int k = 0; k < 6; k++) {
            sum2 += arr[k];
        }

        sum2 -= sum1;

        return Math.abs(sum1 - sum2);
    }


}