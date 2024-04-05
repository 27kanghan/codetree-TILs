import java.io.*;

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

        for(int i = 0; i < 2; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j <N; j++)
            dq.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 0; i < T; i++){
            dq.addFirst(dq.pollLast());
        }

        for(int i = 0; i < N*2; i++){
            if(i == N){
                sb.append("\n");
            }
                sb.append(dq.pollFirst());
                sb.append(" ");
        }




        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}