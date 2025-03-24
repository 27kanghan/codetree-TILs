import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        String str = "";


        for(int i = 0; i < 2; i++){
            str += br.readLine();
        }

        sb.append(str.replace(" ",""));


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
