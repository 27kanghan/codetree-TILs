import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class Point{
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

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[i] = new Point(x,y);
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){

            for(int j = i+1; j <N; j++){
                int x1 = arr[i].x;
                int y1 = arr[i].y;
                int x2 = arr[j].x;
                int y2 = arr[j].y;

                int res = (int) (Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));

                min = Math.min(res,min);

            }
        }


        sb.append(min);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}