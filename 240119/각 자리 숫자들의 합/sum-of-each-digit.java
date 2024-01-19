import javax.management.StringValueExp;
import java.io.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
        StringBuilder sb = new StringBuilder();



//        st = new StringTokenizer(br.readLine());


        String str = br.readLine();
        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            sum += str.charAt(i) - '0';
        }



        sb.append(sum);




        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}