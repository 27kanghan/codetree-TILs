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

        int arr[][] = new int[1001][1001];
        int maxHeight = 0;

        for (int i = 0; i < N; i++) {
            int height = Integer.parseInt(br.readLine());
            maxHeight = Math.max(maxHeight, height);

            for (int j = 0; j < height; j++) {
                arr[i][j] = 1;
            }
        }

//        for(int i = 0; i < N; i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }


        int maxCnt = 0;
        for (int h = 0; h < maxHeight; h++) {
            int cnt = 0;
            boolean flags = false;
            for (int i = 0; i < N; i++) {
                if(arr[i][h] == 1 && !flags){
                    flags = true;
                    cnt++;
                    continue;
                }

                if(arr[i][h] == 0){
                    flags= false;
                    continue;
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