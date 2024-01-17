import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


//        st = new StringTokenizer(br.readLine());

        String str = br.readLine();

        str = str.substring(0,1) + str.substring(2, str.length()-2) + str.substring(str.length()-1);


        sb.append(str);







        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}