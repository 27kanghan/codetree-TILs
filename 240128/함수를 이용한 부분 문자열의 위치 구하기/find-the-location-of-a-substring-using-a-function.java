import java.io.*;

import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {


        String str = br.readLine();
        String s = br.readLine();
        boolean flags = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i , i +  2).equals(s)) {
                sb.append(i);
                flags = true;
            }

            if (flags) {
                break;
            }
        }
        if (!flags) {
            sb.append(-1);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


}