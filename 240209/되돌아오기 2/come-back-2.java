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

        String str = br.readLine();

        int len = str.length();
        int dir = 0;
        int r = 0;
        int c = 0;
        boolean flags = false;
        int cnt = 0;

        for(int i = 0; i < len; i++){

            if(str.charAt(i) == 'F'){
                r = r + dr[dir];
                c = c + dc[dir];
            }else if(str.charAt(i) == 'R'){
                dir = (dir+1) % 4;
            }else if(str.charAt(i) == 'L'){
                dir = (dir+3) % 4;
            }
            cnt++;

            if(r == 0 && c == 0){
                flags = true;
                break;
            }
        }

        if(!flags){
            sb.append(-1);
        }else{
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