import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        //등차수열 (ai, k, aj)
        //k는 무조건 가운대에 들어가야한다.
        //범위는 최소값 ~ 최대값

        int N = Integer.parseInt(br.readLine());

        int arr[][] = new int[N][N];

        for(int i = 0; i < N; i++){
            int height = Integer.parseInt(br.readLine());

            for(int j = 0; j < height; j++){
                arr[i][j] = 1;
            }
        }


        int maxCnt = 0;
        for(int h = 0; h < N; h++){
            int cnt = 0;

            // System.out.println("height = " + h);
            for(int i = 0; i < N; i++){


                if(arr[i][h] == 1) {
                    if(i == 0){
                        if(arr[i+1][h] != 1){
                            cnt++;
                        }
                    }
                    else if(i == N-1){
                        if(arr[i-1][h] != 1){
                            cnt++;
                        }
                    }else if(arr[i - 1][h] != 1 || arr[i + 1][h] != 1) {
                        cnt++;
                        // System.out.println(cnt);
                    }
                }

            }

            maxCnt = Math.max(cnt, maxCnt);
        }

        sb.append(maxCnt);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}