import javax.management.StringValueExp;
import java.io.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        String str1 = br.readLine();
        String str2 = br.readLine();

        int strLen = str1.length();

        int cnt = 0;
        boolean flags = false;

        if (str1.equals(str2)) {
            sb.append(0);
        } else {

            for (int i = 0; i < strLen; i++) {
                cnt++;
                str2 = str2.substring(str2.length() - 1, str2.length()) + str2.substring(0, str2.length() - 1);
                if (str1.equals(str2)) {
                    flags = true;
                    break;
                }
            }

            if (flags) {
                sb.append(cnt);
            } else {
                sb.append(-1);
            }
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}