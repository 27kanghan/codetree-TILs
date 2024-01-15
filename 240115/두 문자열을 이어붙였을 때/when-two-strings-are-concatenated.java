import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        String str = br.readLine();
        String str2 = br.readLine();

        if((str + str2).equals(str2+str)){
            sb.append(true);

        }else{
            sb.append(false);
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}