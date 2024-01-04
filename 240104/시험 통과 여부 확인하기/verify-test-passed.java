import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(st.nextToken());

        if(num >= 80){
            sb.append("pass");
        }else{
            sb.append(80 - num);
            sb.append(" more score");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}