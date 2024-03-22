import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

       
        int N = Integer.parseInt(br.readLine());
        
        if(N < 0){
            sb.append("ice");
        }else if(N >= 100){
            sb.append("vapor");
        }else{
            sb.append("water");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}