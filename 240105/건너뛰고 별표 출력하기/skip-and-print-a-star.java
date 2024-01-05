import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                sb.append("*");
            }
            sb.append("\n");
            sb.append("\n");
        }


        for (int i = n-1; i > 0; i--){
            for(int j = i; j > 0; j--){
                sb.append("*");
            }
            sb.append("\n");
            sb.append("\n");

        }





        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}