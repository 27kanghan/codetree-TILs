import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int a = 11;
        int b = 11;
        int c = 11;
        int day = Integer.parseInt(st.nextToken());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int res = 0;

        if (a > day) {
            res = -1;
        } else if (a == day) {
            if(b > hour){
                res = (-1);
            }
            if(b <= hour){
               if(c > min){
                   res = (-1);
               }
            }
        } else {
            while (true) {
                if (a == day && b == hour && c == min) {
                    break;
                }
                res++;
                c++;
                if (c == 60) {
                    c = 0;
                    b++;
                }

                if (b == 24) {
                    b = 0;
                    a++;
                }

            }

        }


        sb.append(res);
        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }


}