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
        N = Integer.parseInt(br.readLine());

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
        for(int i = N; i > 0; i--){
            if(isVisited[i]) continue;
            answer.add(i);
            isVisited[i] = true;
            permutation(cnt+1);
            answer.remove(answer.size()-1);
            isVisited[i] = false;
        }
    }


    private static void print() {
        for (int i = 0; i < N; i++) {
            sb.append(answer.get(i));
            sb.append(" ");
        }sb.append("\n");
    }


}