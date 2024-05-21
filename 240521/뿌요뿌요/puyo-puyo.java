import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    //totalCount, blockCount

    static int totalCount = 0, blackCount = 0;
    static int N;
    static int map[][];
    static boolean visited[][];
    static int cnt = 0;
    static int maxValue = 0;

    static int dr[] = {1, 0, -1, 0};
    static int dc[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                maxValue = Math.max(map[i][j], maxValue);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 1; k <= maxValue; k++) {
                    cnt = 0;
                    if (map[i][j] == k && !visited[i][j]) {
                        visited[i][j] = true;
                        cnt++;
                        dfs(i, j, k);
                        if(cnt >= 4){
                            blackCount++;

                        }
                        totalCount = Math.max(totalCount, cnt);
                    }
                }
            }
        }


        sb.append(blackCount);
        sb.append(" ");
        sb.append(totalCount);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void dfs(int r, int c, int k) {
        for(int d = 0; d < 4; d++){
            int nr = r + dr[d];
            int nc = c + dc[d];

            if(canGo(nr,nc,k)){
                visited[nr][nc] = true;
                cnt++;
                dfs(nr,nc,k);
            }
        }

    }

    private static boolean canGo(int r, int c, int k){

        if(!inRange(r,c)) return false;

        else if(visited[r][c] || map[r][c] != k) return false;

        return true;
    }

    private static boolean inRange(int r, int c){
        return r >= 0 && r < N && c >= 0 && c < N;
    }


}