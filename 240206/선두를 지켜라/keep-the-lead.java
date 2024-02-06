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

        int cnt = 0;

        int a[] = new int[1000 * 100 + 1];

        int b[] = new int[1000 * 100 + 1];

        int aidx = 0;
        int sum = 0;
        int totalTime = 0;
        String first = "";
        int af = 0;
        int bf = 0;


        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            totalTime += t;
            if(i == 0) af = v;
            for(int j = 0; j < t; j++){
                sum += v;
                a[aidx++] += sum;
            }
        }


        int bidx = 0;
        sum = 0;
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            if(i == 0) bf = v;

            for(int j = 0; j < t; j++){
                sum += v;
                b[bidx++] += sum;
            }
        }

        if(af > bf){
            first = "A";
        }else{
            first = "B";
        }



        for(int i = 0; i < totalTime; i++){
            if(a[i] > b[i] && first.equals("B") || first.equals("")){
                cnt++;
                first = "A";


            }else if(b[i] > a[i] && first.equals("A") || first.equals("")){
                cnt++;
                first = "B";

            }
        }
        sb.append(cnt);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


}