import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        String str = br.readLine();


        str = str.substring(1, str.length()) + str.substring(0, 1);

        sb.append(str);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}