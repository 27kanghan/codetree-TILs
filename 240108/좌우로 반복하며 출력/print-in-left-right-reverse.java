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
            if(i % 2 != 0){
                for(int j = n; j>0; j--){
                    sb.append(j);
                }
            }else{
                for(int j = 0; j < n; j++){
                    sb.append(j+1);
                }
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
