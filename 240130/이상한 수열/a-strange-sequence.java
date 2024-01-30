import java.io.*;

import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();



    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());


        int res = F(n);

        sb.append(res);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


    private static int F(int n){

        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }


        return (F(n/3) + F(n-1));

    }



}