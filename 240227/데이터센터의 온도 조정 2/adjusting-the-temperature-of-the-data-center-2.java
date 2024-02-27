import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class Point {
        int Ta;
        int Tb;

        public Point(int ta, int tb) {
            Ta = ta;
            Tb = tb;
        }
    }


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        // 온도가 Ta보다 낮으면 C만큼
        // Ta이상 Tb이하면 G
        // Tb보다 높으면 H만큼
        // 개수 N개와 장비 작업량 C,G,H
        // 온도 범위

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int max = Integer.MIN_VALUE;

        Point arr[] = new Point[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int Ta = Integer.parseInt(st.nextToken());
            int Tb = Integer.parseInt(st.nextToken());

            arr[i] = new Point(Ta, Tb);

        }

        for (int i = 0; i < 1001; i++) {
            int sum = 0;
            int value = 0;
            for (int j = 0; j < N; j++) {

                if (i < arr[j].Ta) {
                    value = C;
                } else if (i <= arr[j].Tb) {
                    value = G;
                } else if (i > arr[j].Tb) {
                    value = H;
                }
                sum += value;
            }
            max = Math.max(sum, max);
        }

        sb.append(max);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}