import java.io.*;

import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int sum = 1;

        for(int i = 0; i < 3; i++){
            sum *= Integer.parseInt(st.nextToken());
        }


        int res = F(sum);

        sb.append(res);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static int F(int n) {


        if(n < 10){
            return n;
        }

        return F(n / 10) + n % 10;

    }


}