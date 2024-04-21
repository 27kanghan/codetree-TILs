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

    /**
     * N = 크기
     * R, C = 시작 위치
     */
    static int N, R, C;
    /**
     * 격자
     */
    static int arr[][];

    /**
     * 상 하 좌 우 순
     */
    static int dr[]= {-1,1,0,0};
    static int dc[]= {0,0,-1,1};

    /**
     * 정답 담을 리스트.
     */
    static List<Integer> res = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken()) - 1 ;
        C = Integer.parseInt(st.nextToken()) - 1;


        arr = new int[N][N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        res.add(arr[R][C]);

        /**
         * 1. while 문으로 끝날때까지 계속하기.
         * 2. 상 하 좌 우 숫자들 배열에 담은 후 크기 비교
         * 3. 크기 같을 때 인덱스 순으로 비교하기.
         */

        while(true){
            boolean keepGoing = false;

            int max = Integer.MIN_VALUE;
            int idx = 0;

            int value[] = new int [4];

            int nr = 0;
            int nc = 0;
            for(int d = 0; d < 4; d++) {
                nr = R + dr[d];
                nc = C + dc[d];

                if(!inRange(nr,nc)) continue;


                if(arr[nr][nc] >= arr[R][C])
                value[d] = arr[nr][nc];

            }
//            System.out.println(Arrays.toString(value));


            for(int i = 0; i < 4; i++){
                if(value[i] > 0) keepGoing = true;
            }

            if(!keepGoing) break;

            for(int i = 0; i < 4; i++) {

                if (value[i] > arr[R][C]) {
                    res.add(value[i]);
                    idx = i;
                    break;
                } else if (value[i] == max) {
                    res.add(value[i]);
                    if (i < idx) {
                        idx = i;
                    }
                }
            }

            R = R + dr[idx];
            C = C + dc[idx];



        }

        for(int i = 0; i < res.size(); i++){
            sb.append(res.get(i));
            sb.append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }


    private static boolean inRange(int nr, int nc) {
        return nr >= 0 && nr < N && nc >= 0 && nc < N;
    }
}