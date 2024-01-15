import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        st = new StringTokenizer(br.readLine());

        String str = st.nextToken();

        for(int i = str.length()-1; i >= 0; i-=2){
            sb.append(str.charAt(i));
        }


       

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}