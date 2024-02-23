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

        int line[] = new int[101];



//        System.out.println(Arrays.toString(line));

        for(int i = 0; i < N; i++){
            int x = arr[i].x;
            int y = arr[i].y;

            for(int j = x; j <= y; j++){
                line[j]++;
            }
        }

        int cnt = 0;

        for(int i = 0; i < N; i++){
            int xi = arr[i].x;
            int yi = arr[i].y;

            for(int n = xi; n <= yi; n++){
                line[n]--;
            }

            for(int j = i+1; j < N; j++){
                int xj = arr[j].x;
                int yj = arr[j].y;
                for(int n = xj; n <= yj; n++){
                    line[n]--;
                }
                for(int k = j+1; k < N; k++){
                    int xk = arr[k].x;
                    int yk = arr[k].y;

                    for(int n = xk; n <= yk; n++){
                        line[n]--;
                    }

                    boolean flags = true;

//                    System.out.println(Arrays.toString(line));

                    for(int n = 0; n < 101; n++){
                        if(line[n] > 1){
                            flags = false;
                            break;
                        }
                    }
//                    System.out.println(flags);
                    if(flags){
                        cnt++;
                    }

                    for(int n = xk; n <= yk; n++){
                        line[n]++;
                    }
                }
                for(int n = xj; n <= yj; n++){
                    line[n]++;
                }
            }
            for(int n = xi; n <= yi; n++){
                line[n]++;
            }
        }




        sb.append(cnt);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}