import java.io.*;

import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int res = F(N);

        sb.append(res);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static int F(int n) {
        // N 홀수 == 1~N 까지 홀수
        // N 짝수 == 2~N 까지 짝수 합

        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }

        return F(n-2) + n;


    }


}