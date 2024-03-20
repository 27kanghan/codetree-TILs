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
        int x2 = Integer.parseInt(st.nextToken());
        int x3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());

        int arr[] = new int[101];

        for(int i = x1; i <= x2; i++){
            arr[i]++;
        }

        for(int i = x3; i<= x4; i++){
            arr[i]++;
        }

        boolean flags = false;
        for(int i = 0; i < 101; i++){
            if(arr[i] > 1){
                flags = true;
            }
        }


        if(flags) sb.append("intersecting");
        else sb.append("nointersecting");

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}