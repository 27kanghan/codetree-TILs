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

        int M = Integer.parseInt(st.nextToken());


        int a[] = new int [1001];
        int b[] = new int [1001];

        int aidx = 1;
        int at = 0;
        int aTime = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();
            aTime += num;

            if(dir.equals("R")){
                for(int j = 0; j < num; j++){
                    a[aidx++] = ++at;
                }
            }else{
                for(int j = 0; j < num; j++){
                    a[aidx++] = --at;
                }
            }
        }

        int bidx = 1;
        int bt = 0;
        int bTime = 0;
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();
            bTime += num;
            if(dir.equals("R")){
                for(int j = 0; j < num; j++){
                    b[bidx++] = ++bt;

                }
            }else{
                for(int j = 0; j < num; j++){
                    b[bidx++] = --bt;
                }
            }
        }


        int dif = Math.abs(N-M);
        //부족한 시간만큼 채워주기.
        if(N < M){
            for(int i = aidx; i <= aidx+dif+1; i++){
                a[i] = a[i-1];
            }
        }else{
            for(int i = bidx; i <= bidx+dif; i++){
                b[i] = b[i-1];
            }
        }

        int totalTime = Math.max(aTime, bTime);

        boolean meet = true;
        int cnt = 0;
        //판별
        for(int i = 0; i < totalTime; i++){
            if(a[i] != b[i] && meet){
                meet = false;
            }else if(a[i] == b[i] && !meet){
                meet = true;
                cnt++;
            }

        }
        
        sb.append(cnt);

        



        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


}