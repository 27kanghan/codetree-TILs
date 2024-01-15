import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        String str = br.readLine();
        String st2 = br.readLine();

        boolean flags;
        int index = -1;
        for (int i = 0; i <= str.length()-st2.length(); i++) {
            flags = true;
            for (int j = 0; j < st2.length(); j++) {
                if (str.charAt(j + i) != st2.charAt(j)) {
                    flags = false;
                }
            }
            if (flags) {
                index = i;
                break;
            }
        }
        sb.append(index);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}