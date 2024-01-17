import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        int n = Integer.parseInt(st.nextToken());

        char arr[] = str.toCharArray();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            switch (num){
                case 1 :
                    str = str.substring(1, str.length()) + str.substring(0,1);
                    sb.append(str);
                    break;
                case 2 :
                    str = str.substring(str.length()-1, str.length()) + str.substring(0, str.length()-1);
                    sb.append(str);
                    break;
                case 3 :
                    for(int j = str.length()-1; j>=0; j--){
                        sb.append(str.substring(j, j+1));

                    }
                    break;
            }
            sb.append("\n");


        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}