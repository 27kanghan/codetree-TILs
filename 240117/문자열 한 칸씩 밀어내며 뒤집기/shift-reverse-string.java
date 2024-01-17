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

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            switch (num){
                case 1 :
                    str = str.substring(1, str.length()) + str.substring(0,1);
                    break;
                case 2 :
                    str = str.substring(str.length()-1, str.length()) + str.substring(0, str.length()-1);
                    break;
                case 3 :
                    String newStr = "";
                    for(int j = str.length()-1; j>=0; j--){
                        newStr += str.substring(j, j+1);
                    }
                    str = newStr;
                    break;
            }
            sb.append(str);
            sb.append("\n");

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}