import javax.management.StringValueExp;
import java.io.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        String str = br.readLine();
        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                sb.append(String.valueOf(ch[i]).toUpperCase());
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                sb.append(String.valueOf(ch[i]).toLowerCase());
            }
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}