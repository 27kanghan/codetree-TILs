import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int num1 = Integer.parseInt(st.nextToken());


        String res = num1 == 1 ? "t" : "f";

        sb.append(res);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}