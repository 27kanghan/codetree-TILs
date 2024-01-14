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

        int arr[][] = new int [n][n];

        int m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            arr[row-1][col-1] = 1;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n ; j++){
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");

        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}