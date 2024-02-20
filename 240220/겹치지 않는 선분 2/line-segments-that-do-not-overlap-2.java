import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class Point implements Comparable<Point>{
        int x;
        int y;
        boolean flags;

        Point(int x, int y, boolean flags){
            this. x = x;
            this. y = y;
            this.flags = flags;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    ", flags=" + flags +
                    '}';
        }

        @Override
        public int compareTo(Point o) {
            return this.x - o.x;
        }
    }



    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        Point arr[] = new Point[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[i] = new Point(x,y, false);

        }

//        Arrays.sort(arr);

        int cnt = 0;

        for(int i = 0; i < N; i++){

            for(int j = i+1; j < N; j++){
//                if(i==j) continue;
                    int x = arr[i].x;
                    int y = arr[i].y;

                    int a = arr[j].x;
                    int b = arr[j].y;

                    // a랑 b가 x,y안에 있거나 x랑 y가 a,b에 있다.


                    if (x < y) {
                        if(a < b){
                            if(a > x && a < y && b < y && b > x){
                                arr[i].flags =true;
                                arr[j].flags =true;
                            }
                        }else if(a > b ){
                            if(a < y){
                                arr[i].flags =true;
                                arr[j].flags =true;
                            }
                        }
                    }else if(x > y){
                        if(a > b){
                            if(a < y){
                                arr[i].flags =true;
                                arr[j].flags =true;
                            }
                        }else if(a < b){
                            if(a < y){
                                arr[i].flags =true;
                                arr[j].flags =true;
                            }
                        }
                    }

            }
        }

        for(int i = 0; i < N; i++){
            if(!arr[i].flags){
                cnt++;
            }
        }


        sb.append(cnt);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}