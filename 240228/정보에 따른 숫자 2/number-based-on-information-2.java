import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class Point{
        String alpha;
        int coordinate;

        public Point(String alpha, int coordinate) {
            this.alpha = alpha;
            this.coordinate = coordinate;
        }
    }




    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Point arr[] = new Point[T];


        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            String alpha = st.nextToken();
            int coordinate = Integer.parseInt(st.nextToken());
            arr[i] = new Point(alpha, coordinate);
        }

        int cnt = 0;
        for(int i = a; i <= b; i++){

            int k = i;

            int d1 = 0;
            int d2 = 0;
            int minSDiff = Integer.MAX_VALUE;
            int minNDiff = Integer.MAX_VALUE;

            //가장 가까운 S와 N 거리 찾기
            for(int j = 0; j < T; j++){
//                System.out.println(j);

                if(arr[j].alpha.equals("S")) {
                    d1 = Math.abs(arr[j].coordinate - k);
                    minSDiff = Math.min(d1, minSDiff);
                }
//                System.out.println("diff1 = "+ d1);

                if(arr[j].alpha.equals("N")) {
                    d2 = Math.abs(arr[j].coordinate - k);
                    minNDiff = Math.min(d2, minNDiff);
                }
//                System.out.println("diff2 = " + d2);
            }

//            System.out.println("mindiff = " + minSDiff + " " + minNDiff);


            if(minSDiff <= minNDiff){
                cnt++;
            }





        }


        sb.append(cnt);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}