import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int area = (int) Math.pow(n,2);


        sb.append(area);
        sb.append("\n");

        if(n < 5) {
            sb.append("tiny");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}