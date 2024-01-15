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
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'e'){
                cnt1++;
            }else if(str.charAt(i) == 'e' && str.charAt(i+1) == 'b'){
                cnt2++;
            }
        }

        sb.append(cnt1);
        sb.append(" ");
        sb.append(cnt2);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}