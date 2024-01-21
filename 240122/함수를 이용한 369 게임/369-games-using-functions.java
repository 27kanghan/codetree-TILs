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
        String b = st.nextToken();

        sb.append(func(a,b));

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static int func(String a, String b) {



        String res = "";
        
        int cnt = 0;
        
        for(int i = Integer.parseInt(a); i <= Integer.parseInt(b); i++){
            if(String.valueOf(i).contains("3") || String.valueOf(i).contains("6")|| String.valueOf(i).contains("9")
            || (i % 3 == 0)){
                cnt++;
            }
                
            
        }

        return cnt;
    }


}