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

        private Point(int x, int y){
            this.x = x;
            this.y = y;
        }


    }


    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        // x, y 최대값은 100.

        Point arr[] = new Point[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new Point(x, y);
        }

        //최대 갯수
        int max = Integer.MIN_VALUE;
        // 최소 개수
        int min = Integer.MAX_VALUE;

        int minMax = Integer.MAX_VALUE;

        //차이값 최소 저장
        int resMin = Integer.MAX_VALUE;
        int res = 0;


        //x, y좌표 정해주기

        for(int i = 0; i < 101; i++){
            for(int j = 0; j < 101; j++){
                //좌표 정해질 때 마다 사분면 카운트 초기화
                int cnt1 = 0;
                int cnt2 = 0;
                int cnt3 = 0;
                int cnt4 = 0;
                // 다 나눠 졌는지 확인
                int totalCnt = 0;

                // N 개의 좌표들 위치 판별해주기

//                System.out.println("ij" + i +  " " + j );

                for(int n = 0; n < N; n++){
                    int x = arr[n].x;
                    int y = arr[n].y;

                    if(i > x && j < y){
                        cnt1++;
                        totalCnt++;
                    }else if(i < x && j < y){
                        cnt2++;
                        totalCnt++;
                    }else if(i > x && j > y){
                        cnt3++;
                        totalCnt++;
                    }else if(i < x && j > y){
                        cnt4++;
                        totalCnt++;
                    }
                }
                // 제대로 안나눠졌으면 다시
                if(totalCnt != N){
                    continue;
                }

                // System.out.println(cnt1 + " " + cnt2 + " " +cnt3 + " " + cnt4);
                //한번 끝나면 그중 최대값과 최소값 찾기

                max = Math.max(cnt1, Math.max(cnt2, Math.max(cnt3, cnt4)));
                min = Math.min(cnt1, Math.min(cnt2, Math.min(cnt3, cnt4)));

                minMax = Math.min(max,minMax);

//                int diff = Math.abs(Math.abs(cnt1-cnt2) - Math.abs(cnt3-cnt4));
                int diff = max - min;
                // System.out.println("diff"+diff);


                if(diff <= resMin && max <= minMax){
                    // System.out.println("최소값 갱신");
                    resMin = diff;
                    res = max;
                }

            }
        }

        sb.append(res);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


}