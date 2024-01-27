import java.io.*;

import java.util.StringTokenizer;

import static java.util.Collections.swap;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        isPalindrome(str);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void isPalindrome(String str) {
        String newStr = "";

        for(int i = str.length()-1; i >= 0; i--){
            newStr += str.substring(i,i+1);
        }
        
        if(str.equals(newStr)){
            sb.append("Yes");
        }else{
            sb.append("No");
        }

    }


}