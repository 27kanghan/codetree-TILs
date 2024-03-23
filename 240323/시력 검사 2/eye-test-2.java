import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

       
        double N = Double.parseDouble(br.readLine());
        
        if(N > 1){
            sb.append("High");
        }else if(N >= 0.5){
            sb.append("Middle");
        }else{
            sb.append("Low");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}