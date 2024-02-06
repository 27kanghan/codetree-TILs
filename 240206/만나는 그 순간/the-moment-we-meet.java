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

        int a[] = new int[1000*1000+1];
        int b[] = new int[1000*1000+1];

        int sum = 0;


        int aidx = 0;
        int idx = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String dir = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            sum += num;
            for(int j = 0; j < num; j++) {
                if (dir.equals("R")) {
                    a[aidx++] = idx++;
                }else{
                    a[aidx++] = idx--;
                }
            }
        }
        int bidx = 0;
        idx = 0;
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            String dir = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            for(int j = 0; j < num; j++) {
                if (dir.equals("R")) {
                    b[bidx++] = idx++;
                }else{
                    b[bidx++] = idx--;
                }
            }

        }

        int res = 0;
        boolean flags = false;
        for(int i = 1; i < sum; i++){
            if(a[i] == b[i]){
                res = i;
                flags = true;
                break;
            }
        }

        if(flags){
            sb.append(res);
        }else{
            sb.append(-1);
        }





        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


}