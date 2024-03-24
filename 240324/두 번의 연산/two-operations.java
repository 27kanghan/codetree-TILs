import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {


        int N = Integer.parseInt(br.readLine());

        if(N % 2 != 0){
            N += 3;

        }if(N % 3 == 0){
           N /= 3;
        }

        sb.append(N);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}