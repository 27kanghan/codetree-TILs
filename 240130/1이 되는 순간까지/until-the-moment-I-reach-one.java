import java.io.*;

import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        F(N);



        sb.append(cnt);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static int F(int n) {



        if(n == 1){
            return 1;
        }

        cnt++;

        if(n % 2 == 0){
            return F(n / 2);
        }else{
            return F(n / 3);
        }


    }


}