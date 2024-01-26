import java.io.*;

import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        int b = Integer.parseInt(st.nextToken());


        /*
        a 이상 b 이하 수 중 소수이면서 모든 자리 수 합이 짝수인 수의 개수
         */

        int res = func(a, b);

        sb.append(res);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static int func(int a, int b) {

        int cnt = 0;

        for(int i = a; i <= b; i ++){
            if(isPrime(i) && valid(i)){
                cnt++;
            }
        }

        return cnt;
    }

    private static boolean valid(int i) {

       int cnt = 0;
        for(int j = 1; j <= i; j++){
            if(i % j == 0){
                cnt++;
            }
        }

        if(cnt == 2){
            return true;
        }
        return false;
    }

    private static boolean isPrime(int i) {

        String str = String.valueOf(i);

        int sum = 0;

        for(int j = 0; j < str.length(); j++){
            sum += str.charAt(j) - '0';
        }

        if(sum % 2 == 0){
            return true;
        }


        return false;
    }

}