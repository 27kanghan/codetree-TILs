import java.io.*;

import java.sql.Array;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];
        int temp[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int n = 0; n < 2; n++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            Arrays.fill(temp, 0);
            int cnt = 0;
            for (int j = 0; j < N; j++) {

                if (j >= start-1 && j < end) continue;

//                System.out.println(j);

                temp[cnt++] = arr[j];

            }

//            System.out.println(Arrays.toString(temp));

            for (int i = 0; i < N; i++) {
                arr[i] = temp[i];
            }

        }


        int res = 0;
        for (int i = 0; i < N; i++) {
            if(arr[i] != 0) {
                res++;
            }
        }
        sb.append(res);
        sb.append("\n");

        for (int i = 0; i < N; i++) {
            if(arr[i] != 0) {
                sb.append(arr[i]);
                sb.append("\n");
            }
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


}