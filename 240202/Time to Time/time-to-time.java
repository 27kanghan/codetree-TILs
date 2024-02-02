import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int h1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int h2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int res = 0;
        
        while(true){
            if(h1 == h2 && m1 == m2){
                break;
            }


            m1++;
            res++;

            if(m1 == 60){
                h1++;
                m1 = 0;
            }

        }

        sb.append(res);


        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }


}