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


        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[i] = new Point(x, y);
        }





        int cnt = 0;

        for(int i = 0; i < N; i++){

            for(int j = i+1; j < N; j++){
                for(int k = j+1; k < N; k++){

                    int line[] = new int[101];


                    for(int x = 0; x < N; x++) {
                        if (x == i || x == j || x == k) continue;

                        int xk = arr[x].x;
                        int yk = arr[x].y;


                        for (int n = xk; n <= yk; n++) {
                            line[n]++;
                        }
                    }

                    boolean flags = true;

                    for(int n = 0; n < 101; n++){
                        if(line[n] > 1){
                            flags = false;
                            break;
                        }

                    }if(flags){
                        cnt++;
                    }


                }

            }
        }




        sb.append(cnt);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}