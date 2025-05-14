import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = 3;
        int b = 4;
        
        b = a;
        
        sb.append(a);
        sb.append(" ");
        sb.append(b);
        sb.append("\n");
        sb.append(a*b);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
