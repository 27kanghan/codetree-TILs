import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[][] = new int[n][m];


        int cnt = 1;
        for (int k = 0; k < n + m - 1; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i + j == k) {
                        arr[i][j] = cnt++;
                    }
                }
            }
        }

        for(int i =0; i < n ; i++){
            for(int j = 0; j < m; j++){
                sb.append(arr[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}