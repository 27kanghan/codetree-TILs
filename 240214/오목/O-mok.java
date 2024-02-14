import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int dr[] = {1,0,-1,0,1,-1,1,-1};
    static int dc[] = {0,1,0,-1,1,1,-1,-1};

    public static void main(String[] args) throws IOException {


        int arr[][] = new int[19][19];


        for (int i = 0; i < 19; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 19; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        int rIdx = 0;
        int cIdx = 0;
        int r = 0;
        int c = 0;
        int res = 0;
        boolean flags = false;

        for(int i = 0; i < 19; i++){
            for(int j = 0; j < 19; j++){
                r = i;
                c = j;
                int d = 0;

                if(arr[r][c]!=0) {

                    while (true) {
                        if (d == 8) {
                            break;
                        }

                        if (arr[r][c] == 0) {
                            break;
                        }

                        if (r == 19 && c == 19) {
                            break;
                        }


                        int nr = r + dr[d % 8];
                        int nc = c + dc[d % 8];

                        if (!inRange(nr, nc) || arr[nr][nc] == 0) {
                            d++;
                            cnt = 0;
                            continue;
                        }

                        if (arr[r][c] != arr[nr][nc]) {
                            d++;
                            cnt = 0;
                            continue;
                        }

                        cnt++;
                        if(cnt == 3){
                            rIdx = r;
                            cIdx = c;
                        }
                        r = nr;
                        c = nc;


                        if (cnt == 4) {
                            flags = true;
                            res = arr[r][c];
                            break;
                        }
                    }
                }
                if(flags) break;
            }
            if(flags) break;
        }

        if(res > 0){
            sb.append(res);
            sb.append("\n");
            sb.append(rIdx+1);
            sb.append(" ");
            sb.append(cIdx+1);
        }else{
            sb.append(0);
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean inRange(int nr, int nc) {
        return nr >= 0 && nr < 19 && nc >= 0 && nc < 19;
    }


}