import java.io.*;

import java.util.*;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N;
    static int M;

    static int map[][];
    static boolean visited[][];

    static int dr[] = {1, 0, -1, 0};
    static int dc[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(0, 0);


        if(visited[N-1][M-1]){
            sb.append(1);
        }else{
            sb.append(0);
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    public static void bfs(int r, int c) {

        Queue<Point> q = new ArrayDeque<>();

        q.add(new Point(r, c));
        visited[r][c] = true;

        while (!q.isEmpty()) {
            Point curr = q.poll();

            for (int d = 0; d < 4; d++) {
                int nr = curr.x + dr[d];
                int nc = curr.y + dc[d];

                if (canGo(nr, nc)) {
                    q.add(new Point(nr, nc));
                    visited[nr][nc] = true;
                }
            }

        }

    }

    public static boolean canGo(int r, int c) {

        if (!inRange(r, c)) return false;

        if (map[r][c] == 0 || visited[r][c]) return false;

        return true;
    }

    public static boolean inRange(int r, int c) {
        return r >= 0 && r < N && c >= 0 && c < M;
    }


}