import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        st = new StringTokenizer(br.readLine());

        String str1 = st.nextToken();
        String str2 = st.nextToken();

        char arr[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        arr2[0] = arr[0];
        arr2[1] = arr[1];

        String res = String.valueOf(arr2);



        sb.append(res);




        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}