import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {


        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();

        int cnt = 0;

        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                for(int k = j+1; k < N; k++){
                    if(str.charAt(i) == 'C' && str.charAt(j) == 'O' && str.charAt(k) == 'W'){
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