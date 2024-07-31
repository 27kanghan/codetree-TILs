import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());

        sb.append(a);
        sb.append("\n");

        //
        if(a < 0) {
            sb.append("minus");

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
