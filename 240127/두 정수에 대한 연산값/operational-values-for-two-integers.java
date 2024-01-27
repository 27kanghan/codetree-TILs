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

        func(a, b);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void func(int a, int b) {
        if (a > b) {
            a += 25;
            b *= 2;
        }
        else{
            a *= 2;
            b += 25;
        }

        sb.append(a + " " + b);


    }


}