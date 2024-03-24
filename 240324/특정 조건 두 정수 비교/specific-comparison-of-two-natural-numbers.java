import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {


        st = new StringTokenizer(br.readLine());
       int a = Integer.parseInt(st.nextToken());
       int b = Integer.parseInt(st.nextToken());

        if( a < b){
            sb.append(1);
            sb.append(" ");
            sb.append(0);
        }else if( b == a ){
            sb.append(0);
            sb.append(" ");
            sb.append(1);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}