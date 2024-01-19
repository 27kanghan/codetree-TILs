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



        st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int sum = num1 + num2;

        String str = Integer.toString(sum);

        int cnt = 0;
        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == '1'){
                cnt++;
            }
        }



        sb.append(cnt);




        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}