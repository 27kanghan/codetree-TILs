import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];
        Arrays.fill(arr, 1000001);

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            int a = i/2;
            if(i % 2 == 0){
                Arrays.sort(arr);
                sb.append(arr[a]);
                sb.append(" ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


}