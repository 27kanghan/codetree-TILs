import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(st.nextToken());


        for(int i = 0; i < n; i++){
            for(int j = i; j < i * 2  ;j++){
                sb.append("  ");
            }
            for(int j = 0; j < 2 * (n-i) -1 ; j++){
                sb.append("* ");
            }

            sb.append("\n");

        }

        for(int i = 1; i < n; i++){
            for(int j = 0; j < (n - i - 1) * 2 / 2; j++){
                sb.append("  ");
            }

            for(int j = 0; j < 2* i + 1 ; j++){
                sb.append("* ");
            }
            sb.append("\n");
        }





        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}