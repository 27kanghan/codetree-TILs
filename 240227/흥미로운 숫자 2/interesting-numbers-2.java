import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class Point {
        int Ta;
        int Tb;

        public Point(int ta, int tb) {
            Ta = ta;
            Tb = tb;
        }
    }


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int res = 0;
        for(int i = a; i <= b; i++){

            String str = String.valueOf(i);

            int cnt = 0;
            int resCnt = 0;

            for(int j = 0; j < str.length(); j++){
                cnt = 0;
                for(int k = 0; k < str.length(); k++){
                    if(str.charAt(j) != str.charAt(k)){
                        cnt++;
                    }
                }
//                System.out.println(cnt);
                if(cnt == str.length()-1){
                    resCnt++;
                }
            }
//            System.out.println(resCnt);


            if(resCnt < 2 && resCnt != 0){
//                System.out.println(i);
                res++;
            }

        }

        sb.append(res);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}