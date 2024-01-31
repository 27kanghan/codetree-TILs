import java.io.*;

import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();




    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());



        String[] strArr = new String[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            strArr[i] = st.nextToken();
        }

        Arrays.sort(strArr);


        for(int i = 0; i <N; i++){
            sb.append(strArr[i]);
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


}