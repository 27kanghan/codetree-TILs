import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        String str = br.readLine();

        while (true) {

            if (str.length() == 1) {
                break;
            }

            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());


            if (num > str.length()-1 || num < 0) {
                str = str.substring(0, str.length() - 1);
            }else if(num == 0){
                str = str.substring(1, str.length());
            }
            else {
                str = str.substring(0, num) + str.substring(num+1);
            }
            sb.append(str);
            sb.append("\n");

        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}