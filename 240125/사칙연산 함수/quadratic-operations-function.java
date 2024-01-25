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

        String sign = st.nextToken();

        int b = Integer.parseInt(st.nextToken());

        int cal = 0;

        if (sign.equals("*") || sign.equals("+") || sign.equals("/") || sign.equals("-")) {

            cal = cal(a, sign, b);

            sb.append(a);
            sb.append(" ");
            sb.append(sign);
            sb.append(" ");
            sb.append(b);
            sb.append(" ");
            sb.append("= ");
            sb.append(cal);
        } else {
            sb.append("False");
        }
        

        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }

    private static int cal(int a, String sign, int b) {

        int res = 0;

        switch (sign) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "/":
                res = a / b;
                break;
            case "*":
                res = a * b;
                break;
        }


        return res;


    }


}