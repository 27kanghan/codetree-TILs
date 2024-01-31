import java.io.*;

import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int arr[];



    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int res = F(n-1);

        sb.append(res);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


    private static int F(int n){

        if(n == 0){
            return arr[n];
        }


        return gcd(F(n-1), arr[n]);

    }

    private static int gcd(int f, int n) {

        int gcd = 0;

        for(int i = 1; i <= Math.max(f, n); i++ ){
            if(f % i == 0 && n % i == 0){
                gcd = i;
            }
        }
        
        int res = f * n / gcd;

        return res;
    }


}