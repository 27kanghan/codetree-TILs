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

    static List<Integer> ans = new ArrayList<>();
    static int K, N;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());


        // 숫자 범위. 1~K
        K = Integer.parseInt(st.nextToken());
        // 뽑을 갯수
        N = Integer.parseInt(st.nextToken());

        permutation(0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void permutation(int cnt) {
        //기저조건
        if(cnt == N){
//            System.out.println(ans.toString());
            print();
            return;
        }

        for(int i = 1; i <= K; i++){
            ans.add(i);
            permutation(cnt+1);
            ans.remove(ans.size()-1);
        }


    }

    private static void print() {
        for(int i = 0; i < ans.size(); i++){
            sb.append(ans.get(i));
            sb.append(" ");
        }
        sb.append("\n");
    }


}