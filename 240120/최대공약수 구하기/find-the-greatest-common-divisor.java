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
        }
        int max = Integer.MIN_VALUE;

        if(n < m) {
            for (int i = 1; i <= n; i++){
                if(( m % i == 0) && (n % i == 0)){
                    max = Math.max(max,i);
                }
            }
        }else{
            for (int i = 1; i <= m; i++){
                if(( m % i == 0) && (n % i == 0)){
                    max = Math.max(max,i);
                }
            }

        }

        sb.append(max);
    }


}