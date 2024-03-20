import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        // x1, x2, x3, x4 겹치는지 보기.
        // 경계에서 만나도 겹친다.
        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());
        int y4 = Integer.parseInt(st.nextToken());

        int arr[][] = new int[101][101];


//        System.out.println(x1 + " " + x2 + " " + y1 + " "+ y2);
//        System.out.println(x3 + " " + x4 + " " + y3 + " "+ y4);


        for(int i = x1; i <= x2; i++){
            for(int j = y1; j <= y2; j++){
                arr[i][j]++;
            }
        }

        for(int i = x3; i <= x4; i++){
            for(int j = y3; j <= y4; j++){
                arr[i][j]++;
            }
        }

//        for(int i = 0; i < 101; i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }



        boolean flags = false;
        for(int i = 0; i < 101; i++){
            for(int j = 0; j < 101; j++){
                if(arr[i][j] > 1) flags = true;
            }
        }


        if(flags) sb.append("overlapping");
        else sb.append("nonoverlapping");

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}