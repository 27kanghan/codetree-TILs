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

        int minArea = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){

            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;

            for(int j = 0; j < N; j++){

                if(i == j){
                    continue;
                }

//                System.out.println(arr[j]);

                maxX = Math.max(arr[j].x, maxX);
                maxY = Math.max(arr[j].y, maxY);
                minX = Math.min(arr[j].x, minX);
                minY = Math.min(arr[j].y, minY);
                

            }

            int area = Math.abs(maxX - minX) * Math.abs(maxY - minY);

//            System.out.println(area);

            minArea = Math.min(minArea, area);
        }


        sb.append(minArea);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}