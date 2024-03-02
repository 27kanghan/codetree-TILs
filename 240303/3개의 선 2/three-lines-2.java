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



        Point arr[] = new Point[N];

        int max = Integer.MIN_VALUE;


        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new Point(x,y);

            max = Math.max(max, Math.max(y, x));

        }

        int val = 0;

        boolean res = false;


        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= 10; j++){
                for(int k = 0; k <= 10; k++){

                    boolean flags = false;

                    for(int n = 0; n < N; n++){
                        // System.out.println(n);
                        int x = arr[n].x;
                        int y = arr[n].y;
//                        System.out.println(x + " : " + y);
//                        System.out.println(i + " : " + j + " :  " + k);

                        // x 3
                        if(i == x || j == x || k == x){
//                            System.out.println("1번");
                            flags = true;
                        }
                        // x2 y1
                        else if((i == x || j == x || k == y) || (i == x || j == y || k == x) ||
                                (i == y || j == x || k == x)){
//                            System.out.println("2번");
                            flags = true;
                        }
                        // x1 y2

                        else if((i == x || j == y || k == y) || (i == y || j == y || k == x) ||
                                (i == y || j == x || k == y)){
//                            System.out.println("3번");
                            flags = true;
                        }
                        // y 3
                        else if(i == y || j == y || k == y){
//                            System.out.println("4번");
                            flags = true;
                        }else{
//                            System.out.println("5번");
                            flags = false;
                            break;
                        }

                    }
//                    System.out.println(flags);

                    if(flags){
//                        System.out.println("통과");
                        res = true;
                        val = 1;
                        break;
                    }
                }
                if(res) break;
            }
            if(res) break;
        }


        sb.append(val);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}