import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static List<Integer> answer = new ArrayList<>();

    static boolean isVisited[];

    static int N;




    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        isVisited = new boolean[N+1];

        permutation(0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();



    }

    private static void permutation(int cnt) {
        if(cnt == N){
            print();
            return;
        }

        for(int i = 1; i <= N; i++){
            if(isVisited[i]) continue;

            isVisited[i] = true;
            answer.add(i);
            permutation(cnt+1);
            isVisited[i] = false;
            answer.remove(answer.size()-1);

        }

    }

    private static void print() {
        for (int i = 0; i < N; i++) {
            sb.append(answer.get(i));
            sb.append(" ");
        }sb.append("\n");
    }


}