import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int dr[] = {1, 0, -1, 0};
    static int dc[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int r = 0;
        int c = 0;
        int cnt = 0;
        boolean flags = false;
        int sum = 0;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            char dir = st.nextToken().charAt(0);
            int num = Integer.parseInt(st.nextToken());
            int d = 0;
            sum += num;

            if(dir == 'N'){
                d = 0;
            }else if(dir == 'S'){
                d = 2;

            }else if(dir == 'W'){
                d = 3;

            }else if(dir == 'E'){
                d = 1;
            }
            for(int j = 0; j < num; j++){
                r = r+dr[d];
                c = c+dc[d];
                cnt++;

                if(r == 0 && c == 0){
                    flags = true;
                    break;
                }
            }
            if(flags){
                break;
            }

        }
        if(!flags){
            sb.append(-1);
        }else {
            sb.append(cnt);
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


    private static boolean inRange(int r, int c, int N, int M) {
        return r >= 0 && r < N && c >= 0 && c < M;
    }


}