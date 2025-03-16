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
        온전수
        - 2로 나누어 떨어지는 경우
        - 일의자리가 5인 경우
        - 3으로 나누어 떨어지면서 9로는 나누어떨어지지 않는 수.
         */

        int res = func(a, b);

        sb.append(res);

        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }


    private static int func(int a, int b) {

        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0 && !valid(i) && !(i % 3 == 0 && i % 9 != 0 )){
                cnt++;
            }

        }


        return cnt;
    }

    private static boolean valid(int i) {

        String res = String.valueOf(i);

        int length = res.length();


        if (res.charAt(length - 1) - '0' == 5) {

            return true;
        }
        return false;
    }


}
