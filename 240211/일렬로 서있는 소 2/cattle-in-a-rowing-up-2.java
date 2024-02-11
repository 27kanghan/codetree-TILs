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

        int cnt = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N-2; i++) {
            for (int j = i + 1; j < N-1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];

                    if ((i < j && j < k) && (a <= b && b <= c)) {
                        cnt++;
                    }
                }
            }

        }
        sb.append(cnt);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}