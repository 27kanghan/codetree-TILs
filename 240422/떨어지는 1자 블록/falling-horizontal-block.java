import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    static int N, M, K;

    static int arr[][];

    public static void main(String[] args) throws IOException {

        /**
         * 블럭의 범위 : (0,K-1) ~ (0, K+(M-2))
         * 시작 범위 바로 아래 부분 모두 비어있는지 체크 (boolean)
         * 비어 있다면 nr을 옮겨줌
         * 안비어 있으면 (r,k-1) ~ (r, K+(M-2)까지 1로 채워주면 됨.
         */

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

//        for(int i = 0; i < N; i++) System.out.println(Arrays.toString(arr[i]));
//

        //row 는 0부터
        //col 은 (k-1 ~ k + (m-2))까지
        //놓을 수 있는지 없는지 확인.
        boolean isPossible = true;
        //가능한 row 저장
        int row = 0;

        for (int r = 0; r < N; r++) {
            if (r == N - 1) {
                row = N - 1;
                break;
            }
            for (int c = K - 1; c < K + (M - 1); c++) {
                if (arr[r + 1][c] == 1) {
                    isPossible = false;
                    row = r;
                    break;
                }
            }
            if (!isPossible) break;
        }

        for (int c = K - 1; c < K + (M - 1); c++) {
            arr[row][c] = 1;
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}