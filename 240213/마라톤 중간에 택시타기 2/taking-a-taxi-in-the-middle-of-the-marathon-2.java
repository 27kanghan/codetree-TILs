import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static class Point implements Comparable<Point>{
        int r;
        int c;
        int idx;

        public Point(int r, int c, int idx) {
            this.r = r;
            this.c = c;
            this.idx = idx;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "r=" + r +
                    ", c=" + c +
                    ", idx=" + idx +
                    '}';
        }

        @Override
        public int compareTo(Point o) {
            return this.idx - o.idx;
        }
    }

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        Point arr[] = new Point[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arr[i] = new Point(r,c,i);
        }

        Arrays.sort(arr);



        int min = Integer.MAX_VALUE;
        for(int i = 1; i < N-1; i++){
            int sum = 0;
            arr[i].idx = N;
            Arrays.sort(arr);

            for(int j = 0; j < N-1; j++){
                if(i != j){

                    sum += Math.abs(arr[j+1].r - arr[j].r) + Math.abs(arr[j+1].c - arr[j].c);
                }
            }
            arr[i].idx = i;

            min = Math.min(sum, min);
        }


        sb.append(min);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}