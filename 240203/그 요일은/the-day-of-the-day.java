import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static String dayOfWeek[] = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    static int dayOfMonth[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(st.nextToken());

        int d1 = Integer.parseInt(st.nextToken());

        int m2 = Integer.parseInt(st.nextToken());

        int d2 = Integer.parseInt(st.nextToken());

        String day = br.readLine();

        int totalDay = cal(m1, m2, d1, d2);

        int cal = totalDay / 7;

        int dayNum = 0;

        int res = 0;

        for (int i = 0; i < 7; i++) {
            if (dayOfWeek[i].equals(day)) {
                dayNum = i;
            }
        }


        if (totalDay >= dayNum) {
          res += 1;
        }

        res += cal;

        sb.append(res);


        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }

    private static int cal(int m1, int m2, int d1, int d2) {

        int total1 = 0;
        for (int i = 1; i < m1; i++) {
            total1 += dayOfMonth[i];
        }

        total1 += d1;


        int total2 = 0;

        for (int i = 1; i < m2; i++) {
            total2 += dayOfMonth[i];
        }
        total2 += d2;

        int total = total2 - total1;

        if (total < 0) {
            while (total < 0) {
                total += 7;
            }
        }


        return total;

    }


}