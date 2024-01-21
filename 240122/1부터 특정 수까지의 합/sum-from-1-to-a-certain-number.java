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

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        sb.append(func(n));

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static int func(int n) {



        int sum = 0;
        int res = 0;


        for(int i = 0; i <= n; i++){
            sum+=i;
        }

        res = sum / 10;

        return res;
    }


}