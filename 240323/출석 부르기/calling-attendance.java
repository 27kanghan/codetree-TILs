import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

       
        int N = Integer.parseInt(br.readLine());
        
        if(N == 1){
            sb.append("John");
        }else if(N == 2){
            sb.append("Tome");
        }else if(N == 3){
            sb.append("Paul");
        }else{
            sb.append("Vacancy");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}