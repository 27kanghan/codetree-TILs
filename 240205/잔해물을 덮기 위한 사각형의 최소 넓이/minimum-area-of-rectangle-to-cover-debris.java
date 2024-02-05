import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {


        int arr[][] = new int[2001][2001];

        int idx = 1000;

        for (int k = 0; k < 2; k++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());


            for (int i = idx + y1; i < idx + y2; i++) {
                for (int j = idx + x1; j < idx + x2; j++) {
                    if (k == 1) {
                        arr[i][j] = 0;
                    } else {
                        arr[i][j] = 1;

                    }
                }
            }
        }

        int minx = 9999;
        int miny = 9999;
        int maxx = -9999;
        int maxy = -9999;

        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                if(arr[i][j] > 0 ) {
                    minx = Math.min(minx, j);
                    miny = Math.min(miny, i);
                    maxx = Math.max(maxx, j);
                    maxy = Math.max(maxy, i);
                }
            }
        }



        int area = (Math.abs(maxx)-Math.abs(minx) + 1) * (Math.abs(maxy)-Math.abs(miny) + 1);

        sb.append(area);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


}