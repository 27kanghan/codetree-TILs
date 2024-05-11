import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int arr[][];
    static int ans[][];
    static boolean visited[][];

    static int N, M;
    static int order = 1;


    public static void main(String[] args) throws IOException {


        st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];
        ans = new int[N][M];



        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ans[0][0] = order++;
        visited[0][0] = true;
        dfs(0,0);

        if(ans[N-1][M-1] != 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }


    }

    private static void dfs(int x, int y) {
        int dx[] = new int[]{1,0};
        int dy[] = new int[]{0,1};

        for(int d = 0; d <2; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(canGo(nx,ny)){
                ans[nx][ny] = order++;
                visited[nx][ny] = true;
                dfs(nx,ny);
            }
        }
    }

    private static boolean canGo(int nx, int ny) {
        if(!inRange(nx,ny)) return false;
        if(visited[nx][ny] == true || arr[nx][ny] == 0){
            return false;
        }
        return true;
    }

    private static boolean inRange(int nx, int ny) {
        return nx >= 0 &&  nx < N && ny >= 0 && ny < N;
    }


}