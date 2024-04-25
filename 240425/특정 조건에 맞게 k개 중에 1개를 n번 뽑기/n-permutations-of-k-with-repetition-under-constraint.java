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

    static List<Integer> answer = new ArrayList<>();

    static int K, N;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        /**
         * 수행 과정
         * 1. 조합 만든다.
         * 2. 조합이 만들어 지면 검증한다.
         * 2-1) cnt를 통해 연속성 검증.
         * 2-2) cnt가 3이면 false return.
         * 3. true가 반환되면 출력.
         */
        permutation(0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static void permutation(int cnt){
        //기저조건
        if(cnt == N){
            if(valid()){
                print();
            }
            return;

        }

        for(int i = 1; i <= K; i++){
            answer.add(i);
            permutation(cnt+1);
            answer.remove(answer.size()-1);
        }


    }

    static boolean valid(){

        int cnt = 1;


        for(int i = 1; i < answer.size(); i++){
            
            if(answer.get(i) == answer.get(i-1)){
                cnt++;
            }else{
                cnt = 1;
            }

            if(cnt >= 3) return false;
        }

        return true;
    }

    static void print(){
        for(int i = 0; i < answer.size(); i++){
            sb.append(answer.get(i));
            sb.append(" ");
        }
        sb.append("\n");
    }

}