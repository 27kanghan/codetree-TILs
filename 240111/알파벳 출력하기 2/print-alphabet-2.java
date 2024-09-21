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
        int a = 65;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++){
                sb.append("  ");
            }
            for (int j = 0; j < n-i; j++) {
                sb.append((char)(a));
                sb.append( " ");
                a++;
                if(a == 91){
                    a = 65;
                }
            }
            sb.append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
