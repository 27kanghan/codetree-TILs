import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        String str1 = br.readLine();
        String str2 = br.readLine();

        if(str1.length() != str2.length()){
            sb.append("No");
        }else{
            char c1[] = str1.toCharArray();
            char c2[] = str2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            boolean flags = true;

            for(int i = 0; i < c1.length; i++){
                if(c1[i] != c2[i]){
                    flags = false;
                    break;
                }

            }

            if(flags){
                sb.append("Yes");
            }else{
                sb.append("No");
            }

        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


}