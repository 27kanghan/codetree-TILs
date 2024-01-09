import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 2; i < 9; i+=2){
            for(int j = m; j >= n; j--){
                sb.append(j);
                sb.append(" * ");
                sb.append(i);
                sb.append(" = ");
                sb.append(i * j);
                if(j != n){
                    sb.append(" / ");
                }

            }
            sb.append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}