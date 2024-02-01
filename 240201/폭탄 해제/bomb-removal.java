import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class CodeTree {

        String code;
        String color;
        int time;

        public CodeTree(String code, String color, int time){
            this.code = code;
            this.color = color;
            this.time = time;
        }
    }

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        String code = st.nextToken();
        String color = st.nextToken();
        int time = Integer.parseInt(st.nextToken());

        CodeTree codeTree = new CodeTree(code, color, time);

        System.out.println("code : " + codeTree.code);
        System.out.println("color : " + codeTree.color);
        System.out.println("second : " + codeTree.time);





    }


}