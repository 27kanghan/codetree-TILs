import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int dayOfMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        int depth = dayOfMonth[m1-1] - d1;

        for(int i = m1; i < m2-1; i++){
            depth += dayOfMonth[i];
        }

        depth += d2 + 1 ;



        sb.append(depth);


        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }


}