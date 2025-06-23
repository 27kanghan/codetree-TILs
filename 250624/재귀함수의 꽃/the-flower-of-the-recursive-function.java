import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        

        int n = Integer.parseInt(br.readLine());


        met(n);

        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }

    public static void met(int n) {

        if (n == 0) {
            return;
        }


        sb.append(n);
        sb.append(" ");
        met(n-1);
        sb.append(n);
        sb.append(" ");
        

    }
}
