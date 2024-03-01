import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class Point{
        int a;
        int b;
        int c;

        private Point(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {



        //N번
        //A와 B를 바꾼 후 C를 열어서 돌이 있으면 점수
        //조약돌을 어디에 넣어야 점수를 제일 많이받을까?

        int N = Integer.parseInt(br.readLine());

        Point arr[] = new Point[N];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arr[i] = new Point(a,b,c);

        }

        for(int i = 1; i < 4; i++){
            int stone[] = new int[4];
            int cnt = 0;
            stone[i] = 1;

            for(int j = 0; j < N; j++){

                int temp = stone[arr[j].a];
                stone[arr[j].a] = stone[arr[j].b];
                stone[arr[j].b] = temp;


//                System.out.println(Arrays.toString(stone));

                if(stone[arr[j].c] == 1){
//                    System.out.println("open");
                    cnt++;
                }
            }
//            System.out.println("done");
            max = Math.max(cnt,max);

        }

        sb.append(max);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}