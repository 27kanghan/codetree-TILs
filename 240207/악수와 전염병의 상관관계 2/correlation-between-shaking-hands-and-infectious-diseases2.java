import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    static class Point implements Comparable<Point>{
        int time;
        int a;
        int b;

        public Point(int time, int a, int b) {
            this.time = time;
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "time=" + time +
                    ", a=" + a +
                    ", b=" + b +
                    '}';
        }

        @Override
        public int compareTo(Point o) {
            return this.time - o.time;
        }
    }


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        // 개발자 수
        int N = Integer.parseInt(st.nextToken());
        // 최대 횟수
        int K = Integer.parseInt(st.nextToken());
        // 최초 감염자
        int P = Integer.parseInt(st.nextToken());
        // 테스트케이스
        int T = Integer.parseInt(st.nextToken());

        int arr[] = new int[N+1];
        boolean isInfection[] = new boolean[N+1];
        Point parr[] = new Point[T];

        arr[P] = K;
        isInfection[P] = true;

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            parr[i] = new Point(t, a, b);
        }



        Arrays.sort(parr);

     

        for(int i = 0; i < T; i++){
            int a = parr[i].a;
            int b = parr[i].b;
            if(arr[a] > 0 && arr[b]>0){
                arr[a]--;
                arr[b]--;
            }else if(arr[a]>0){
                arr[a]--;
                arr[b] = K;
                isInfection[b] = true;
            }else if(arr[b]>0){
                arr[b]--;
                arr[a] = K;
                isInfection[a] = true;
            }
        }

        for(int i = 1; i < N+1; i++){
            if(isInfection[i]){
                sb.append(1);
            }else{
                sb.append(0);
            }
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


}