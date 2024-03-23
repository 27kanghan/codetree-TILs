import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

       
        int N = Integer.parseInt(br.readLine());
        
        if(N >= 3000){
            sb.append("book");
        }else if(N >= 1000){
            sb.append("mask");
        }else if(N >= 500){
            sb.append("pen");
        }else{
            sb.append("no");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}