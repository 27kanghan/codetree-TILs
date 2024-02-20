import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        Point arr[] = new Point[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[i] = new Point(x, y);
        }

        int max = 0;

        for (int i = 0; i < N; i++) {

            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int x1 = arr[i].x;
                    int y1 = arr[i].y;
                    int x2 = arr[j].x;
                    int y2 = arr[j].y;
                    int x3 = arr[k].x;
                    int y3 = arr[k].y;

                    int area = 0;

                    if (x1 == x2 || x2 == x3 || x3 == x1) {
                        if (y1 == y2 || y1 == y3 || y2 == y3) {


                            area = Math.abs((x1 * y2 + x2 * y3 + x3 * y1) - (x2 * y1 + x3 * y2 + x1 * y3));
                        }
                    }
                    max = Math.max(area, max);
                }
            }
        }


        sb.append(max);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}