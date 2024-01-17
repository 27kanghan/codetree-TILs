import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            if(str.substring(i, i+1).equals("e")){
               str =  str.substring(0, i) + str.substring(i+1);
               break;
            }
        }


        sb.append(str);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}