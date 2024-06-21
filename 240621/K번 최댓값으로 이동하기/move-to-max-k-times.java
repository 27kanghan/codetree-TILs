import java.io.*;

import java.util.*;

class Point implements Comparable<Point> {
    int r;
    int c;
    int value;

    public Point(int r, int c, int value) {
        this.r = r;
        this.c = c;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Point{" +
                "r=" + r +
                ", c=" + c +
                ", value=" + value +
                '}';
    }

    @Override
    public int compareTo(Point o) {
        //수가 같그면 행
        //행이 같으면 열
        if (o.value == this.value) {
            if (o.r == this.r) {
                return this.c - o.c;
            }
            return this.r - o.r;

        } else {
            return o.value - this.value;
        }
    }
}


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N, K, nextR, nextC, startR, startC;

    static int map[][];
    static boolean visited[][];

    static int dr[] = {0, 0, -1, 1};
    static int dc[] = {1, -1, 0, 0};


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[N][N];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());

        startR = Integer.parseInt(st.nextToken());
        startC = Integer.parseInt(st.nextToken());


        nextR = startR - 1;
        nextC = startC - 1;


        for (int i = 0; i < K; i++) {
            visited = new boolean[N][N];
//            System.out.println(nextR + " " + nextC + " 갱신 확인");
            bfs(nextR, nextC);
//            System.out.println(i + " 번째");

        }

        sb.append(nextR+1);
        sb.append(" ");
        sb.append(nextC+1);

        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }

    private static void bfs(int r, int c) {

        Queue<Point> q = new ArrayDeque<>();
        ArrayList<Point> list = new ArrayList<>();

        q.add(new Point(r, c, map[r][c]));

        visited[r][c] = true;

        while (!q.isEmpty()) {
//            System.out.println("123");
            Point cur = q.poll();

            for (int d = 0; d < 4; d++) {
                int nr = cur.r + dr[d];
                int nc = cur.c + dc[d];

                if (canGo(nr, nc)) {
                    q.add(new Point(nr, nc, map[nr][nc]));
                    list.add(new Point(nr, nc, map[nr][nc]));
                    visited[nr][nc] = true;
                }
            }

        }

        Collections.sort(list);

        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i).toString());
        // }

        if(list.size() == 0){
            return;
        }
        nextR = list.get(0).r;
        nextC = list.get(0).c;
//        System.out.println(nextR + " " + nextC + " " + map[nextR][nextC] + " 124");


    }

    private static boolean canGo(int r, int c) {
//        System.out.println(map[nextR][nextC]);
        if (!inRange(r, c)) return false;

        if (visited[r][c] || map[r][c] >= map[nextR][nextC]) return false;

        return true;


    }

    private static boolean inRange(int r, int c) {
        return r >= 0 && r < N && c >= 0 && c < N;
    }


}