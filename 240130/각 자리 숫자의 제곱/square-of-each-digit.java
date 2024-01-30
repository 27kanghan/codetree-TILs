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

        int res = pow(N);

        sb.append(res);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static int pow(int n) {

        //기저조건
        if(n < 10){
            return (int) Math.pow(n, 2);
        }


        return (int) (pow(n / 10) + Math.pow(n % 10,2));

    }


}