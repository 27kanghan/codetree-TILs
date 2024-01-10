import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j ++){
                sb.append("(");
                sb.append(i);
                sb.append(", ");
                sb.append(j);
                sb.append(")");
                if((i+j) % 4 == 0){
                    sb.append("\n");
                }else{
                    sb.append(" ");
                }
            }
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}