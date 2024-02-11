import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {


       String str = br.readLine();

       int cnt = 0;

       for(int i = 0; i < str.length()-1; i++){
           for(int j = i+1; j < str.length(); j++){
               if(str.charAt(i) == '('){
                   if(str.charAt(j) == ')'){
                       cnt++;
                   }

               }
           }
       }



        sb.append(cnt);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }



}