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
       int b=  Integer.parseInt(st.nextToken());


        if(a % 2 == 0){
            sb.append("even");
        }else{
            sb.append("odd");
        }

        sb.append("\n");

        if(b % 2 == 0){
            sb.append("even");
        }else{
            sb.append("odd");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}