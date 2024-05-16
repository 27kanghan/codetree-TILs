import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int dr[] = {1, 0, -1, 0};
    static int dc[] = {0, 1, 0, -1};

    static int map[][];
    static int arr[][];
    static boolean visited[][];

    static int N, M;

    static int maxArea = Integer.MIN_VALUE;
    static int maxValue = Integer.MIN_VALUE;

    static int order = 1;

    static List<Integer> area = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        int resultK = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                maxValue = Math.max(maxValue, map[i][j]);
            }
        }

        for (int k = 1; k <= maxValue; k++) {
            visited = new boolean[N][M];
            arr = new int[N][M];
            area.clear();
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    if (!visited[r][c] && map[r][c] > k) {
                        visited[r][c] = true;
                        dfs(r, c, k);
                        area.add(order);
                        order = 1;
                    }
                }
            }

//            System.out.println("size" + area.size());

            if(maxArea <= area.size()){
                maxArea = area.size();
                resultK = k;
            }

            // System.out.println("K" + k);
//            for (int i = 0; i < N; i++) {
//                for (int j = 0; j < M; j++) {
//                    System.out.print(arr[i][j] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println("+++++++++++++++++++");
        }

        sb.append(resultK);
        sb.append(" ");
        sb.append(maxArea);

        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }

    private static void dfs(int r, int c, int k) {

        for (int d = 0; d < 4; d++) {

            int nr = r + dr[d];
            int nc = c + dc[d];

            if (canGo(nr, nc, k)) {
                arr[nr][nc] = order++;
                visited[nr][nc] = true;
                dfs(nr, nc, k);
            }

        }

    }

    private static boolean canGo(int nr, int nc, int k) {

        if (!inRange(nr, nc)) return false;

        if (visited[nr][nc] || map[nr][nc] <= k) return false;

        return true;

    }

    private static boolean inRange(int r, int c) {
        return r >= 0 && r < N && c >= 0 && c < M;
    }


}