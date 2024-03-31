import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {


        int a = Integer.parseInt(br.readLine());


        if(a >= 3 && a <= 5){
            sb.append("Spring");
        }else if(a >= 6 && a <= 8){
            sb.append("Summer");
        }else if(a >= 9 && a <= 11){
            sb.append("Fall");
        }else{
            sb.append("Winter");
        }



        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}