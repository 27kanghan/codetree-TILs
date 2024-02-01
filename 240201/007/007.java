import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class CodeTree {
        String code;
        String point;
        int time;

        public CodeTree(String code, String point, int time){
            this.code = code;
            this.point = point;
            this.time = time;

        }


    }

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        String code = st.nextToken();
        String point = st.nextToken();
        int time = Integer.parseInt(st.nextToken());

        CodeTree codeTree = new CodeTree(code, point, time);

        sb.append("secret code : ").append(codeTree.code).append("\n").append("meeting point : ")
                .append(codeTree.point).append("\n").append("time : ").append(codeTree.time);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


}