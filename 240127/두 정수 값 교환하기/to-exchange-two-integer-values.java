import java.io.*;

import java.util.StringTokenizer;

import static java.util.Collections.swap;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        swap(a,b);



        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

        sb.append(a + " " + b);

    }


}