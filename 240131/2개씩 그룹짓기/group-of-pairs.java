import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int a[] = new int [N * 2];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N * 2 ; i++){
            a[i] =Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        Arrays.sort(a);
        for(int i = 0; i < N; i++){
            sum = a[i] + a[a.length-1-i];
            max = Math.max(sum,max);
        }

        sb.append(max);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


}