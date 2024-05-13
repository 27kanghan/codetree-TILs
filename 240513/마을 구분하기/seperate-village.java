import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int arr[][];
    static int people[][];
    static boolean visited[][];
    static List<Integer> ans = new ArrayList<>();
    static int village = 0;

    static int N;
    static int res;

    static int dr[] = {1,0,-1,0};
    static int dc[] = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        res = 1;

        arr = new int[N][N];
        people = new int[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(arr[i][j] == 1 && !visited[i][j]){
                    visited[i][j] = true;
                    people[i][j] = res++;
                    village++;
                    dfs(i,j);
                    ans.add(res);
                    res = 1;
                }
            }
        }

        Collections.sort(ans);

        sb.append(village);
        sb.append("\n");

        for(int i = 0; i < ans.size(); i++){
            sb.append(ans.get(i)-1);
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void dfs(int r, int c){

        for(int d = 0; d < 4; d++){
            int nr = r + dr[d];
            int nc = c + dc[d];

            if(canGo(nr,nc)){
                people[nr][nc] = res++;
                visited[nr][nc] = true;
                dfs(nr,nc);
            }
        }



    }

    private static boolean canGo(int r, int c){
        if(!inRange(r,c)) return false;
        else if(arr[r][c] == 0 || visited[r][c]) return false;
        return true;
    }

    private static boolean inRange(int r, int c){
        return r >= 0 && r < N && c >= 0 && c < N;
    }





}