import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        // 학생 수
        int N = Integer.parseInt(st.nextToken());
        // 횟수
        int M = Integer.parseInt(st.nextToken());
        //벌칙 횟수
        int K = Integer.parseInt(st.nextToken());

        int student[] = new int[N+1];

        int res = 0;

        boolean flags = false;
        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(br.readLine());
            student[num]++;

            for(int j = 0; j < N; j++){
                if(student[j] == K){
                    res = j;
                    flags = true;
                    break;
                }
            }

            if(flags){
                break;
            }

        }

        sb.append(res);


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


}