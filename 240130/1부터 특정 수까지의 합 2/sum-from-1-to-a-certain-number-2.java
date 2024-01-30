import java.io.*;

import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int arr[] ;

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int res = sum(N);

        sb.append(res);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static int sum(int n) {

        //기저조건
        if(n == 1){
            return 1;
        }

        return sum(n-1) + n;

    }


}