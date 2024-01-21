import javax.management.StringValueExp;
import java.io.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        String a =(st.nextToken());

        sb.append(func(a));

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static String func(String a) {



        String res = "";
        
        int sum = 0;
        
        for(int i = 0; i < a.length(); i++){
            sum += a.charAt(i) - '0';
        }

        if((Integer.parseInt(a) % 2 == 0) && (sum % 5 == 0)){
            res = "Yes";
        }else{
            res = "No";
        }

        return res;
    }


}