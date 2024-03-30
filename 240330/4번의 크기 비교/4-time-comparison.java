import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        
        
        
        int a = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());



        System.out.println(a > b ? 1 : 0);
        System.out.println(a > c ? 1 : 0);
        System.out.println(a > d ? 1 : 0);
        System.out.println(a > e ? 1 : 0);




        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}