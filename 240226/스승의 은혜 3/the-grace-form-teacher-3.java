import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class Point implements Comparable<Point> {
        int cost;
        int delivery;
        int total;

        private Point(int cost, int delivery, int total) {
            this.cost = cost;
            this.delivery = delivery;
            this.total = total;
        }

        public int compareTo(Point o) {
            return this.total - o.total;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "cost=" + cost +
                    ", delivery=" + delivery +
                    ", total=" + total +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int B = Integer.parseInt(st.nextToken());

        Point arr[] = new Point[N];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int cost = Integer.parseInt(st.nextToken());
            int delivery = Integer.parseInt(st.nextToken());
            int total = cost+delivery;
            arr[i] = new Point(cost, delivery,total);
        }

        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            arr[i].cost = arr[i].cost/2;
            arr[i].total = arr[i].cost + arr[i].delivery;
            int sum = 0;
            int cnt = 0;
            for(int j = 0; j < N; j++){
                sum += arr[j].total;
                cnt++;

                if(sum > B){
                    sum -= arr[j].total;
                    cnt--;
                    continue;
                }
            }

            max = Math.max(cnt, max);


            arr[i].cost = arr[i].cost*2;
            arr[i].total = arr[i].cost + arr[i].delivery;
        }

        sb.append(max);




        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}