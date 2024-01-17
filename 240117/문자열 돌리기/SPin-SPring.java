import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        String str = br.readLine();

        sb.append(str);
        sb.append("\n");

        for(int i = 0; i < str.length(); i++) {
            str = str.substring(str.length()-1, str.length()) + str.substring(0, str.length()-1);
            sb.append(str);
            sb.append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}