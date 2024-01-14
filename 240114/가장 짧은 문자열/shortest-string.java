import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < 3; i++){
            String str = br.readLine();
            
            max = Math.max(max, str.length());
            min = Math.min(min, str.length());
        }

        sb.append(max - min);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}