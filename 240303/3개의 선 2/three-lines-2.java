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


        for(int i = 0; i <= max; i++){
            for(int j = 0; j <= max; j++){
                for(int k = 0; k <= max; k++){

                    boolean flags = false;

                    for(int n = 0; n < N; n++){
                        int x = arr[n].x;
                        int y = arr[n].y;

                        // x 3
                        if(i == x || j == x || y == x){
                            flags = true;
                            continue;
                        }
                        // x2 y1
                        else if((i == x || j == x || k == y) || (i == x || j == y || k == x) ||
                                (i == y || j == x || k == x)){
                            flags = true;
                            continue;
                        }
                        // x1 y2

                        else if((i == x || j == y || k == y) || (i == y || j == y || k == x) ||
                                (i == y || j == x || k == y)){
                            flags = true;
                            continue;
                        }

                        // y 3
                        else if(i == y || j == y || y == y){
                            flags = true;
                            continue;
                        }else{
                            flags = false;
                            break;
                        }

                    }

                    if(flags){
                        // System.out.println(i + " " + j + " " + k);
                        res = true;
                        val = 1;
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