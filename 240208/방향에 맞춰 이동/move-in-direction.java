import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        int r = 0;
        int c = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            String dir = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if(dir.equals("N")){
                r += num;
            }else if(dir.equals("E")){
                c += num;
            }else if(dir.equals("S")){
                r -= num;
            }else{
                c -= num;
            }
            


        }

        sb.append(c);
        sb.append(" ");
        sb.append(r);


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


}