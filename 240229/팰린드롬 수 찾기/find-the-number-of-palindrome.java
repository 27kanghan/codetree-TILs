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

        int cnt = 0;

        for(int i = a; i <= b; i++){
            String str = String.valueOf(i);
            StringBuffer sbf = new StringBuffer(str);
            String reverseStr = sbf.reverse().toString();
            


            if(str.equals(reverseStr)){
                cnt++;
            }
        }

        sb.append(cnt);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}