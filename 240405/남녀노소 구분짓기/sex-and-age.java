import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        int sex = Integer.parseInt(br.readLine());
        int age = Integer.parseInt(br.readLine());

        if(sex == 0){
            if(age < 19){
                sb.append("BOY");
            }else{
                sb.append("MAN");
            }
        }else{
            if(age < 19){
                sb.append("GIRL");
            }else{
                sb.append("WOMAN");
            }
        }



        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}