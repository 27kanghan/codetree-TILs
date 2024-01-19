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

        int n = Integer.parseInt(st.nextToken());

        String str = st.nextToken();

        int cnt = 0;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            if(str.equals(st.nextToken())){
                cnt++;
            }
        }



        sb.append(cnt);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}