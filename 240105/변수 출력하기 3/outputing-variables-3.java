import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
     //   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int a = 1;
        int b = 2;
        String c = "C";
        String arrow = "->";
        
        sb.append(a);
        sb.append(arrow);
        sb.append(b);
        sb.append(arrow);
        sb.append(c);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
