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

        int arr[][] = new int[n][n];


        int cnt = 1;
        int change = 0;

        for(int i = n-1; i >=0 ; i--) {
            if (change % 2 == 0) {
                for (int j = n - 1; j >= 0; j--) {
                    arr[j][i] = cnt++;
                }
            }else{
                for (int j = 0; j < n; j++){
                    arr[j][i] = cnt++;
                }
            }
            change++;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
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