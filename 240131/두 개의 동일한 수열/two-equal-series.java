import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int a[] = new int [N];
        int b[] = new int [N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            a[i] =Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());


        for(int i = 0; i < N; i++){
            b[i] =Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b);

        boolean flags = true;

        for(int i = 0; i< N; i++){
            if(a[i] != b[i]){
                flags = false;
            }
        }

        if(flags){
            sb.append("Yes");
        }else{
            sb.append("No");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


}