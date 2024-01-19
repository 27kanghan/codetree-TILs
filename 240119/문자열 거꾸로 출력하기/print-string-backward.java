import javax.management.StringValueExp;
import java.io.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();




        while(true){
            st = new StringTokenizer(br.readLine());

            String word = st.nextToken();

            if(word.equals("END")){
                break;
            }

            for(int i = word.length()-1; i >= 0; i--){
                sb.append(word.substring(i,i+1));
            }
            sb.append("\n");


        }



        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}