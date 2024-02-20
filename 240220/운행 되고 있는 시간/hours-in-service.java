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

        for(int i = 0; i < N; i++){

           int time[] = new int[1001];
           int cnt = 0;

            for(int j = 0; j< N; j++){

                if(i == j ) continue;;


                int a2 = arr[j].x;
                int b2 = arr[j].y;
//                System.out.println(a2 + " " + b2);


                for(int k = a2; k < b2; k++){
                    time[k] = 1;
                }


            }
            for(int k = 0; k < 1001; k++){
                if(time[k] == 1){
                    cnt++;
                }
            }

            max = Math.max(cnt, max);
        }

        sb.append(max);



        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}