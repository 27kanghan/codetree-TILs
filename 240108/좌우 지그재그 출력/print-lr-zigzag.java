import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
 //

        int n = Integer.parseInt(st.nextToken());
        int cnt = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i % 2 == 0){
                    sb.append(n*i-j+1);
                    sb.append(" ");
                }
                else{
                    sb.append(n*(i-1)+j);
                    sb.append(" ");

                }
            }
            sb.append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
