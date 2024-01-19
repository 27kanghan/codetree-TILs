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


        Deque<String> dq = new ArrayDeque<>();
        int cnt = 0;
        while(true){
            st = new StringTokenizer(br.readLine());

            String word = st.nextToken();

            if(word.equals("0")){
                break;
            }
            cnt++;



            if(cnt % 2 != 0){
                dq.add(word);
            }
        }

        sb.append(cnt);
        sb.append("\n");

        while(!dq.isEmpty()){
            sb.append(dq.pollFirst());
            sb.append("\n");
        }



        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}