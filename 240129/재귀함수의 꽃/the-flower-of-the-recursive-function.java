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

        print(N);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


    private static void print(int n) {

        if(n == 0){
            return;
        }

        sb.append(n);
        sb.append(" ");
        print(n-1);

        sb.append(n);
        sb.append(" ");




    }


}