import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int max = Integer.MIN_VALUE;

        for (int i = a; i <= b; i++) {

            int n = i;
            int sum = 0;
            while (true) {


                sum += n / 10;

                n = n % 10;


                if (n < 10) {
                    sum += n;
                    break;
                }
            }

            max = Math.max(max, sum);

        }

        sb.append(max);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}