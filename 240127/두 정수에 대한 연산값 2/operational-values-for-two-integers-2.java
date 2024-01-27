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
        int b = Integer.parseInt(st.nextToken());

        func(a,b);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void func(int a, int b) {

        if(a > b){
            a *= 2;
            b += 10;
        }else{
            a += 10;
            b *= 2;
        }

        sb.append(a + " " + b);

    }


}