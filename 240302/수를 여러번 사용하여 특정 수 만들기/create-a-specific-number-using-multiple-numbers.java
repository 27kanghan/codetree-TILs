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
        int c = Integer.parseInt(st.nextToken());

        int atime = c / a;
        int btime = c / b;
        int max = 0;
        for(int i = 0; i <= atime; i++){
            int multi = 0;
            for(int j = 0; j <= btime; j++){
                multi = (a * i) + (b * j);

//                System.out.println(multi);
                if(c < multi){
//                    System.out.println("good");
                    multi = (a * i) + (b * (j-1));
//                    System.out.println(multi);
                    break;
                }

            }

            max = Math.max(max, multi);
        }

        sb.append(max);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}