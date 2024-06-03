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

        //
        for(int i = 1; i <= 9; i++){
            for(int j = m; j >= n; j-=2){
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
