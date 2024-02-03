import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        int arr[] = new int[str.length()];

        for(int i = 0; i < arr.length; i++){
            arr[i] = str.charAt(i)-'0';
        }

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum * 2 + arr[i];
        }

        sb.append(sum);

        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }


}