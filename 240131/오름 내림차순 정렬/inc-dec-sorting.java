import java.io.*;

import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static Integer arr[];



    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        arr = new Integer[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            sb.append(arr[i]);
            sb.append(" ");
        }

        sb.append("\n");

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < n; i++){
            sb.append(arr[i]);
            sb.append(" ");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


}