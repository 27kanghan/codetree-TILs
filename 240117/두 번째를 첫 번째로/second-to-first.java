import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


//        st = new StringTokenizer(br.readLine());

        String str = br.readLine();

        char arr[] = str.toCharArray();

        char a = arr[1];
        char b = arr[0];

        for(int i = 0; i < str.length(); i++){
            if(arr[i] == a){
                arr[i] = b;
            }
        }

        sb.append(String.valueOf(arr));







        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}