import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(st.nextToken());
        int a = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append((char)(a));
                a++;
            }
            sb.append("\n");
        }


        //
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
