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

        String str = br.readLine();
        String dir = br.readLine();

        char dirArr[] = dir.toCharArray();


        Deque<Character> dq = new ArrayDeque<>();

        for(int i = 0; i < str.length(); i++){
            dq.add(str.charAt(i));
        }

        //R이면 뒤에거 빼서 앞으로

        for(int i = 0; i < dirArr.length; i++){

            if(dirArr[i] == 'R'){
                dq.addFirst(dq.pollLast());
            }else{
                dq.addLast(dq.pollFirst());
            }

        }

        while(!dq.isEmpty()) sb.append(dq.pollFirst());



        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}