import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int H = Integer.parseInt(st.nextToken());

        int T = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];


        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // T번씩 H 높이어야 한다.
        // 구간을 T로 나누기.
        // H보다 낮으면 -1 높으면 +1 Cnt 더하기
        // min 값 찾자.

        int min = Integer.MAX_VALUE;


        for(int i = 0; i <= N - T; i++){
            // 하기 전에 배열 복사하자.

            int cnt = 0;
            int copy[] = new int[N];
            for(int a = 0; a < N; a++){
                copy[a] = arr[a];
            }
            // 같아질 때 까지 평탄화 진행

            while(true) {
                for (int j = i; j < i + T; j++) {
                    if (copy[j] > H) {
                        copy[j]--;
                        cnt++;
                    } else if (copy[j] < H) {
                        copy[j]++;
                        cnt++;
                    }
                }

                // 다 같은지 확인.
                boolean flags = true;
                for (int j = i; j < i + T; j++) {
                    if (copy[j] != H) {
                        flags = false;
                    }
                }


                if (flags) {
                    min = Math.min(cnt, min);
                    break;
                }
            }

        }

        sb.append(min);




        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }



}