import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int dr[] = {1, 0, -1, 0};
    static int dc[] = {0, 1, 0, -1};
    static int r;
    static int c;
    static int d;

    public static void main(String[] args) throws IOException {


        int N = Integer.parseInt(br.readLine());

        char arr[][] = new char[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            arr[i] = str.toCharArray();
        }

        int cnt = 0;
        int K = Integer.parseInt(br.readLine());

        d = findDirection(K, N);

        while(true){
            if(inRange(N)){
                cnt++;
            }

            func(arr);

            r += dr[d];
            c += dc[d];

            if(!inRange(N)){
                break;
            }

        }


        sb.append(cnt);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void func(char[][] arr) {
        if(arr[r][c] == '/'){
            if(d == 0) d = 3;
            else if(d == 1) d = 2;
            else if(d == 2) d = 1;
            else if(d == 3) d = 0;
        }else if(arr[r][c] == '\\'){
            if(d == 0) d = 1;
            else if(d == 1) d = 0;
            else if(d == 2) d = 3;
            else if(d == 3) d = 2;
        }
    }

    private static int findDirection(int k, int n) {

        if (n >= k) {
            r = 0;
            c = (k - 1) % n;
            return 0;
        }
        else if (n < k && k <= n * 2) {
            c = n-1;
            r = (k - 1) % n;
            return 3;
        }
        else if (n * 2 < k && k <= n * 3) {
            r = n-1;
            c = n * 3 - k;
            return 2;
        }else {
            c = 0;
            r = n * 4 - k;
            return 1;
        }
    }


    private static boolean inRange(int N) {
        return r >= 0 && r < N && c >= 0 && c < N;
    }


}