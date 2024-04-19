import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    /**
     * 격자의 크기
     * Q : 바람 몇번 부는지
     */
    static int N, M, Q;

    /**
     * 격자 정보 저장
     */
    static int arr[][];

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        /*
        입력부
         */
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        /**
         * 1. Q만큼 회전 -> 새 배열에 담아서 다시 원 배열에 넣어주기.
         *    배열은 그대로 복제하는게 나을까? 그냥 -1로 채워넣자.
         * 2. 회전 후 평균 값 계산
         */

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int r1 = Integer.parseInt(st.nextToken()) - 1;
            int c1 = Integer.parseInt(st.nextToken()) - 1;
            int r2 = Integer.parseInt(st.nextToken()) - 1;
            int c2 = Integer.parseInt(st.nextToken()) - 1;
            wind(r1, c1, r2, c2);
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j  < M; j++){
                sb.append(arr[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }

    private static void wind(int r1, int c1, int r2, int c2) {

        /**
         * 새 배열에 담아준 후 원래 배열에 덮어 씌우는 형식으로 가자.
         */

        int newArr[][] = new int[N][M];

        for (int i = 0; i < N; i++) {
            Arrays.fill(newArr[i], -1);
        }

        // 가로1 가로2 세로1 세로2 4번에 나눠서 직접 옮겨주장

        // 윗 가로
        for (int i = c1; i < c2; i++) {
            newArr[r1][i + 1] = arr[r1][i];
        }

        // 아래 가로

        for (int i = c2; i > c1; i--) {
            newArr[r2][i - 1] = arr[r2][i];
        }

        // 오른쪽 세로

        for (int i = r1; i < r2; i++) {
            newArr[i + 1][c2] = arr[i][c2];
        }

        // 왼쪽 세롤

        for (int i = r2; i > r1; i--) {
            newArr[i - 1][c1] = arr[i][c1];
        }

        // 다시 옮기기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (newArr[i][j] != -1) {
                    arr[i][j] = newArr[i][j];
                }
            }
        }

        // 프린트 함 찍어보자


//        print(arr);

        // 평균 값으로 대체해주기

        getAvg(r1, c1, r2, c2);


    }

    private static void getAvg(int r1, int c1, int r2, int c2) {

        int dr[] = {1, 0, -1, 0};
        int dc[] = {0, 1, 0, -1};

        int newArr[][] = new int[N][M];

        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                int cnt = 1;
                int sum = arr[i][j];
                for(int d = 0; d < 4; d++){
                    int nr = i + dr[d];
                    int nc = j + dc[d];

                    if(!inRange(nr,nc)) continue;

                    sum += arr[nr][nc];
                    cnt++;

                }

                newArr[i][j] = sum / cnt;

            }
        }

        for(int i = r1; i <= r2; i++){
            for(int j = c1; j <= c2; j++){
                arr[i][j] = newArr[i][j];
            }
        }

//        print(arr);


    }

    private static boolean inRange(int nr, int nc) {
        return nr >= 0 && nr < N && nc >= 0 && nc < M;
    }

    private static void print(int arr[][]) {
        System.out.println("++++++++++++++++++++++++++++");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}