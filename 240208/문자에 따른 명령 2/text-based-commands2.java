import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int dr [] = {1,0,-1,0};
        int dc [] = {0,1,0,-1};

        String dir = br.readLine();

        int len = dir.length();
        int idx = 0;

        int r = 0;
        int c = 0;

        for(int i = 0; i < len; i++){
            if(dir.charAt(i) == 'L'){
                idx = (idx+3) % 4;
            }else if(dir.charAt(i) == 'R'){
                idx = (idx+1) % 4;
            }else if(dir.charAt(i) == 'F'){
                r += dr[idx];
                c += dc[idx];
            }
        }


        sb.append(c);
        sb.append(" ");
        sb.append(r);


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


}