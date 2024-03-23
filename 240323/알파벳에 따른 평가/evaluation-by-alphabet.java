import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

       
        char N = br.readLine().charAt(0);
        
        if(N == 'S'){
            sb.append("Superior");
        }else if(N == 'A'){
            sb.append("Excellent");
        }else if(N == 'B'){
            sb.append("Good");
        }else if(N == 'C'){
            sb.append("Usually");
        }else if(N == 'D'){
            sb.append("Effort");
        }else{
            sb.append("Failure");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}