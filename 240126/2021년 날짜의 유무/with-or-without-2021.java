import java.io.*;

import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int dayOfMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int month = Integer.parseInt(st.nextToken());

        int day = Integer.parseInt(st.nextToken());


        if(month >= 1 && month <= 12 && day >= 1 && day <= dayOfMonth[month-1]){
            sb.append("Yes");
        }else{
            sb.append("No");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


}