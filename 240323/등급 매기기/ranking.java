import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

       
        int N = Integer.parseInt(br.readLine());
        
        if(N >= 90){
            sb.append("A");
        }else if(N >= 80){
            sb.append("B");
        }else if(N >= 70){
            sb.append("C");
        }else if(N >= 60){
            sb.append("D");
        }else{
            sb.append("F");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}