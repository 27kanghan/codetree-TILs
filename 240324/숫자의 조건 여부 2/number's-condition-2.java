import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {


        int N = Integer.parseInt(br.readLine());

        if(N == 5){
            sb.append("A");

        }if(N % 2 == 0){
           sb.append("B");
        }



        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}