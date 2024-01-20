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

        print(n);




        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void print(int n) {

        int cnt = 1;
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n; j ++) {
                sb.append(cnt);
                cnt++;
                if(cnt == 10) cnt = 1;
                sb.append(" ");
            }
            sb.append("\n");
           
          
        }


    }


}