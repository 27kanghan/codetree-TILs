import java.util.*;
import java.io.*;


class Point {
    int r;
    int c;

    public Point(int r, int c) {
        this.r = r;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Point{" +
                "r=" + r +
                ", c=" + c +
                '}';
    }
}

public class Main {

    static int dr[] = {1, 0, -1, 0};
    static int dc[] = {0, 1, 0, -1};

    static int N, K, M;
    static int map[][];

    static boolean visited[][];

    static boolean isVisited[];

    static ArrayList<Point> list;
    static ArrayList<Point> result;
    static ArrayList<Point> start;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        visited = new boolean[N][N];
        list = new ArrayList<>();
        result = new ArrayList<>();
        start = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == 1) {
                    list.add(new Point(i, j));
                }
            }
        }


        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int sr = Integer.parseInt(st.nextToken());
            int sc = Integer.parseInt(st.nextToken());
            start.add(new Point(sr-1, sc-1));
        }

        isVisited = new boolean[list.size()];

        permutation(0);

        sb.append(max);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    public static void permutation(int cnt) {

        if (cnt == M) {

            int copy[][] = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    copy[i][j] = map[i][j];
                }
            }

            for (int i = 0; i < result.size(); i++) {
                copy[result.get(i).r][result.get(i).c] = 0;
            }

            for (int i = 0; i < K; i++) {
                visited = new boolean[N][N];
                bfs(i, copy);
                calculate();
            }
            return;
        }


        for (int i = 0; i < list.size(); i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                result.add(list.get(i));

                permutation(cnt + 1);

                result.remove(result.size() - 1);
                isVisited[i] = false;
            }

        }


//        return new Point(0,0);
    }

    public static void bfs(int i, int[][] copy) {

        Queue<Point> q = new ArrayDeque<>();

        q.add(start.get(i));
        visited[start.get(i).r][start.get(i).c] = true;

        while (!q.isEmpty()) {
            Point p = q.poll();

            for(int d = 0; d < 4; d++){
                int nr = p.r + dr[d];
                int nc = p.c + dc[d];

                if(valid(nr,nc,copy)){
                    q.add(new Point(nr,nc));
                    visited[nr][nc] = true;
                }
            }

        }

//        st = new StringTokenizer(br.readLine());

    }

    public static boolean valid(int nr, int nc, int[][] copy){

        if(!inRange(nr,nc)) return false;
        if(copy[nr][nc] == 1 || visited[nr][nc]) return false;

        return true;

    }

    public static boolean inRange(int nr, int nc){
        return nr >= 0 && nr < N && nc >= 0 && nc < N;
    }
    public static void calculate(){

        int cnt = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(visited[i][j]){
                    cnt++;
                }
            }
        }

        max = Math.max(cnt, max);
    }
}