import java.io.*;

import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();




    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        String newStr = new String(chars);

        System.out.println(newStr);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


}