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

        private Point(int a, int b){
            this.a = a;
            this.b = b;
        }
    }


    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        Point arr[] = new Point[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[i] = new Point(a,b);
        }


        int maxB = arr[0].b/2;

        int min = Integer.MAX_VALUE;

        for(int i = 1; i <= maxB; i++){

            int n = i * 2;

            boolean flags = true;
            for(int j = 0; j < N; j++){

                if( !(n >= arr[j].a && n <= arr[j].b) ){
                    flags = false;
                    break;
                }

                n *= 2;
            }

            if(flags){
                min = Math.min(min, i);
            }

        }

        sb.append(min);
        bw.write(sb.toString());
        bw.flush();
        bw.close();



    }
}