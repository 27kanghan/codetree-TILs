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


        st = new StringTokenizer(br.readLine());

        String str = st.nextToken();

        Deque<Character> dq = new ArrayDeque<>();

        for(int i = 1; i < str.length(); i+=2){
            dq.add(str.charAt(i));
        }

        while(!dq.isEmpty()){
            sb.append(dq.pollLast());
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}