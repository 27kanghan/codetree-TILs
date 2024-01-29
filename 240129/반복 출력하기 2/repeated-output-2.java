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

        printHello(N);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void printHello(int n) {

        if(n == 0){
            return;
        }

        printHello(n-1);
        sb.append("HelloWorld");
        sb.append("\n");


    }


}