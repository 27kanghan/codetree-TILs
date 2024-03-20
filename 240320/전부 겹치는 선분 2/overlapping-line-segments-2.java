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

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[i] = new Point(x,y);
        }

        boolean flags = false;
        int area [];
        for(int i = 0; i < N; i++){
            area = new int[101];
            flags = false;

            for(int j = 0; j < N; j++){

                if( i == j ) continue;

                int x = arr[j].x;
                int y = arr[j].y;

//                System.out.println(x + " " + y);

                for(int k = x; k <= y; k++){
                    area[k]++;
                }

            }

//            System.out.println(Arrays.toString(area));

            for(int j = 0; j < 101; j++){
                if(area[j] == N-1){
                    flags = true;
                }
            }

            if(flags){
                break;
            }

        }

        if(flags){
            sb.append("Yes");
        }else{
            sb.append("No");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}