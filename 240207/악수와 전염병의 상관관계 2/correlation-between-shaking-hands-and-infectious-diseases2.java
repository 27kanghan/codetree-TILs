import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    static class Point implements Comparable<Point> {
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

        int arr[] = new int[N + 1];
        int isInfection[] = new int[N + 1];
        Point parr[] = new Point[T];

        for (int i = 1; i < N + 1; i++) {
            arr[i] = K;
        }

        isInfection[P] = 1;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            parr[i] = new Point(t, a, b);
        }


        Arrays.sort(parr);

//            if((a == P || arr[a] > 0) && (b == P || arr[b]>0)){
//                arr[a]--;
//                arr[b]--;
//            }else
//        System.out.println(Arrays.toString(parr));

        for (int i = 0; i < T; i++) {
            int a = parr[i].a;
            int b = parr[i].b;
            if(isInfection[a] == 1 && isInfection[b] == 1){
                arr[a]--;
                arr[b]--;
            }
            if ((a == P || isInfection[a] == 1) && arr[a] > 0) {
                arr[a]--;
                isInfection[b] = 1;
            } else if ((b == P || isInfection[b] == 1) && arr[b] > 0) {
                arr[b]--;
                isInfection[a] = 1;
            }
//            System.out.println(a + " " + b);
//            System.out.println(i + " " + Arrays.toString(arr));
//            System.out.println(i + " " + Arrays.toString(isInfection));
        }

        for (int i = 1; i < N + 1; i++) {
            sb.append(isInfection[i]);
        }


        //101100000100100000000000

        //100000100110110001101010
        //101100000100100111000001
        //101100000100100000000001

//        System.out.println(Arrays.toString(isInfection));


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


}