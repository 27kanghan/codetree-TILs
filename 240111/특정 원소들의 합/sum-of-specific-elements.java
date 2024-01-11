import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int arr[][] = new int [4][4];

        for(int i = 0; i < 4; i ++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 4; j ++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int sum = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j <= i; j++){
                sum += arr[i][j];
            }
        }

        sb.append(sum);



        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}