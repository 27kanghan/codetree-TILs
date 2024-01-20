import javax.management.StringValueExp;
import java.io.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        printWord(n);




        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void printWord(int n) {

        for(int i = 0 ; i < n; i++){
            sb.append("12345^&*()_");
            sb.append("\n");
        }
        

    }


}