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

        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            min = Math.min(arr[i],min);
            max = Math.max(arr[i],max);
        }

        int cnt = 0;
        int maxCnt = 0;
        for (int i = min + 1; i < max; i++) {
            int k = i;
            cnt = 0;

            for (int a = 0; a < N; a++) {
                for (int b = a + 1; b < N; b++) {

                    if (Math.abs(arr[a] - k) == Math.abs(arr[b] - k)) {
                        cnt++;
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