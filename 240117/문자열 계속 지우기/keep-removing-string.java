import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
//

        String str = br.readLine();
        String a = br.readLine();
        int totalLen = str.length();
        int len = a.length();

        while (true) {
            if (str.contains(a)) {
                for (int i = 0; i < totalLen - len+1; i++) {
                    if (str.substring(i, i + len).equals(a)) {
                        str = str.substring(0, i) + str.substring(i + len);
                        
                        totalLen = str.length();
                        
                    }
                }
                
            }else {
                break;
            }

        }

        sb.append(str);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}
