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

        print(0, N);
        sb.append("\n");
        printReverse(N);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void printReverse(int n) {
        if(n == 0){
            return;
        }
        sb.append(n);
        sb.append(" ");
        printReverse(n-1);
    }

    private static void print(int cnt, int n) {

        if(cnt == n){
            return;
        }

        sb.append(++cnt);
        sb.append(" ");
        print(cnt, n);




    }


}