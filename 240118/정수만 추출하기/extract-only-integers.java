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



        st = new StringTokenizer(br.readLine());

        String arr[] = new String[2];

        for(int i = 0; i < arr.length; i++){
            arr[i] = st.nextToken();
        }

        int sum = 0;
        for (int i = 0; i < 2; i++) {

            for(int j = 0; j < arr[i].length(); j++){
                int i1 = arr[i].charAt(j) - '0';
                if( i1 < 0 || i1 > 10 ){
                    sum += Integer.parseInt(arr[i].substring(0, j));
                }
            }
        }

        sb.append(sum);




        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}