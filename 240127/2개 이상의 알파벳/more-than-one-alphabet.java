import java.io.*;

import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {


        String str = br.readLine();

        valid(str);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void valid(String str){
        int cnt = 0;
        boolean flags = false;

        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < str.length(); j++){
                if(i != j){
                    if(!(str.substring(i,i+1).equals(str.substring(j,j+1)))){
                        cnt++;
                    }
                }
            }
            if(cnt >= 2){
                flags = true;
                break;
            }
        }

        if(flags){
            sb.append("Yes");
        }else{
            sb.append("No");
        }

    }




}