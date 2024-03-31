import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {


        int a = Integer.parseInt(br.readLine());


        if(a % 13 == 0 || a % 19 == 0)
        {
            sb.append("True");
        }else{
            sb.append("False");
        }



        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}