import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int dr[] = {1, 0, -1, 0, 1, -1, 1, -1};
    static int dc[] = {0, 1, 0, -1, 1, 1, -1, -1};

    public static void main(String[] args) throws IOException {


        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        char arr[][] = new char[N][M];


        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int res = 0;

        String str = "";

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                int d = 0;
                int r = i;
                int c = j;
                int cnt = 1;
                if(arr[i][j] == 'L') {
                    while (true) {
                        if(d == 8){
                            break;
                        }
                        str += arr[r][c];

                        if(cnt == 3 && str.equals("LEE")){
                            res++;
                            cnt = 1;
                            str = "";
                            r = i;
                            c = j;
                            d++;
                            continue;
                        }

                        int nr = r + dr[d % 8];
                        int nc = c + dc[d % 8];

                        if(!inRange(nr,nc,N,M)){
                            cnt = 1;
                            str = "";
                            d++;
                            r = i;
                            c = j;
                            continue;
                        }

                        cnt++;
                        r = nr;
                        c = nc;

                    }
                }
            }
        }





        sb.append(res);


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


    private static boolean inRange(int nr, int nc, int N, int M) {
        return nr >= 0 && nr < N && nc >= 0 && nc < M;
    }


}