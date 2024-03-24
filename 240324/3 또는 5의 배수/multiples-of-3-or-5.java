import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {



       int a = Integer.parseInt(br.readLine());


        if(a % 3 == 0){
            sb.append("YES");
            sb.append("\n");
        }else{
            sb.append("NO");
            sb.append("\n");
        }

        if(a % 5 == 0){
            sb.append("YES");
            sb.append("\n");
        }else{
            sb.append("NO");
            sb.append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}