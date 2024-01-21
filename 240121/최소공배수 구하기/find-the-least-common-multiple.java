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
        int m = Integer.parseInt(st.nextToken());

        func(n, m);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void func(int n, int m) {

        if (n == m){
            sb.append(n);
        }else {

            int max = 0;

            for (int i = 1; i <= Math.max(n, m); i++) {
                if ((n % i == 0) && (m % i == 0)) {
                    max = i;
                }
            }

            int i = 0;
            int res = 0;

            while(true){
                i++;

                if(max*i >= Math.max(n,m) && ((i*max)%m == 0) && ((max*i)%n) == 0){
                    res = max * i;
                    break;
                }

            }


            sb.append(res);
        }
    }


}