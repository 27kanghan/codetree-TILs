import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        String arr[][] = new String[5][3];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++){
                arr[i][j] = st.nextToken().toUpperCase();
            }
        }


        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");


        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}