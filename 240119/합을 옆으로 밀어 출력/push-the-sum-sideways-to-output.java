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


        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            sum += Integer.parseInt(st.nextToken());
        }

        String str = Integer.toString(sum);

        str = str.substring(1, str.length()) + str.substring(0, 1);


        sb.append(str);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}