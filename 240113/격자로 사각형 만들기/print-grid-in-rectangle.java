import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        //
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int arr[][] = new int[n][n];


        for(int i = 0; i < n; i++){
                arr[i][0] = arr[0][i] = 1;
            }

        for(int i = 1; i < n; i ++) {
            for(int j = 1; j < n; j++){
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1] + arr[i][j-1];
            }
        }

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n; j++){
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }



        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
