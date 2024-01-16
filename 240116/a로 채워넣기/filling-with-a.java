import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        String str = br.readLine();
//        String st2 = br.readLine();

        char arr[] = str.toCharArray();

        arr[1] = arr[arr.length-2] = 'a';

        str = String.valueOf(arr);

        sb.append(str);




        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}