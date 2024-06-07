import java.io.*;

import java.util.*;

class Point {
    int r;
    int c;

    Point(int r, int c) {
        this.r = r;
        this.c = c;
    }

}

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N, K;
    static int map[][];
    static boolean visited[][];

    static int dr[] = {0, 1, 0, -1};
    static int dc[] = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int sum = 0;

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (!visited[r - 1][c - 1]) {
                sum += bfs(r - 1, c - 1);
            }
        }

        sb.append(sum);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    public static int bfs(int r, int c) {
        int cnt = 1;

        Queue<Point> q = new ArrayDeque<>();

        q.add(new Point(r, c));
        visited[r][c] = true;

        while (!q.isEmpty()) {
            Point cur = q.poll();

            for (int d = 0; d < 4; d++) {
                int nr = cur.r + dr[d];
                int nc = cur.c + dc[d];

                if (canGo(nr, nc)) {
                    q.add(new Point(nr, nc));
                    visited[nr][nc] = true;
                    cnt++;
                }

            }
        }


        return cnt;
    }

    public static boolean canGo(int r, int c) {

        if (!inRange(r, c)) return false;

        if (visited[r][c] || map[r][c] == 1) return false;

        return true;
    }

    public static boolean inRange(int r, int c) {
        return r >= 0 && r < N && c >= 0 && c < N;
    }


}