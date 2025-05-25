import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        //

        int n = Integer.parseInt(st.nextToken());


        for(int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                for (int k = i; k > 0; k--) {
                    sb.append("*");
                }
                sb.append(" ");
            }
            sb.append("\n");
        }



        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
