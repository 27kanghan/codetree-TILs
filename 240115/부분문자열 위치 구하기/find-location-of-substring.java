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
        for (int i = 0; i < str.length(); i++) {
            flags = true;
            for (int j = i; j < st2.length(); j++) {
                if (str.charAt(j) != st2.charAt(j)) {
                    flags = false;
                }
                if(flags){
                    index = i;
            }
        }
    }
        sb.append(index);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

}
}