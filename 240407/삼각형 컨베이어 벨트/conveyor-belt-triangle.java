import java.io.*;

import java.sql.Array;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());


        Deque<Integer> dq = new ArrayDeque<>();


        for(int i = 0; i < 3; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N ; j ++){
                dq.add(Integer.parseInt(st.nextToken()));
            }
        }


        for(int i = 0; i < T; i++){
            dq.addFirst(dq.pollLast());
        }

        for(int i = 1; i <= N * 3; i++){
            sb.append(dq.pollFirst());
            sb.append(" ");

            if(i % 3 == 0){
                sb.append("\n");
            }
        }



        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}