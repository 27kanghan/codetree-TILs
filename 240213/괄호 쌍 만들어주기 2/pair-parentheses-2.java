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
        for(int i = 0; i < str.length()-3; i++){
            if(str.charAt(i) == '(' && str.charAt(i+1) =='(') {
                for(int j = i+2; j < str.length()-1; j++){
                    if(str.charAt(j) == ')' && str.charAt(j+1) == ')'){
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