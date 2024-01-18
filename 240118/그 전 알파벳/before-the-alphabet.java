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


        char ch = br.readLine().charAt(0);
        int preCh = ch-1;


        //a = 97
        //z = 122

        if(preCh < 97){
            sb.append('z');
        }else{
            sb.append((char)preCh);
        }





        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}