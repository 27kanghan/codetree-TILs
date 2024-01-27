import java.io.*;

import java.util.StringTokenizer;

import static java.util.Collections.swap;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {


        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        func(arr);

        for(int i = 0; i < N; i++){
            sb.append(arr[i]);
            sb.append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void func(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            arr[i] = Math.abs(arr[i]);
        }

    }


}