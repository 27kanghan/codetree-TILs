import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    static int K, N;
    static List<Integer> answer = new ArrayList<>();



    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());

        N = Integer.parseInt(st.nextToken());

//        permu(0);
        combi(0, 1);

        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }

    private static void combi(int cnt, int start) {
        if(cnt == N){
            print();
            return;
        }

        for(int i = start; i<=K; i++){
            answer.add(i);
            combi(cnt+1, i+1);
            answer.remove(answer.size()-1);
        }


    }

    static void permu(int cnt){
        if(cnt == N){
            print();

            return;
        }

        for(int i = 1; i <= K; i++){
            answer.add(i);
            permu(cnt+1);
            answer.remove(answer.size()-1);
        }
    }

    private static void print() {
        for (int i = 0; i < answer.size(); i++) {
            sb.append(answer.get(i));
            sb.append(" ");
        }
        sb.append("\n");
    }
}