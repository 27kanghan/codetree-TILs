import java.io.*;

import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static char arr1[];
    static char arr2[];

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(st.nextToken());

        arr1 = new char[n];
        arr2 = new char[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = st.nextToken().charAt(0);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr2[i] = st.nextToken().charAt(0);
        }

        if (m > m) {
            sb.append("No");
        } else {


            boolean flags = func();

            String res = "";

            if (flags) {
                res = "Yes";
            } else {
                res = "No";
            }
            sb.append(res);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static boolean func() {


        boolean flags = false;

        for (int i = 0; i < arr1.length - arr2.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i + j] == arr2[j]) {
                    cnt++;
                }
            }

            if (cnt == arr2.length) {
                flags = true;
                break;
            }
        }
        return flags;

    }


}