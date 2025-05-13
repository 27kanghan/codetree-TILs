import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        double a = 5.26;
        double b = 8.27;
        double ab = a*b;



        sb.append(String.format("%.3f",ab));


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
