import java.io.*;

import java.sql.Array;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());


        int a = Integer.parseInt(st.nextToken());
        String asex = st.nextToken();

        st = new StringTokenizer(br.readLine());


        int b = Integer.parseInt(st.nextToken());
        String bsex = st.nextToken();

        if((a >= 19 && asex.equals("M")) || (b >= 19 && bsex.equals("M"))){
            sb.append(1);
        }else{
            sb.append(0);
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}