import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class CodeTree {

        String id;
        int level;

        public CodeTree(){
            this.id = "codetree";
            this.level = 10;
        }

        public CodeTree(String id, int level){
            this.id = id;
            this.level = level;

        }
    }

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        String id = st.nextToken();
        int level = Integer.parseInt(st.nextToken());

        CodeTree codeTree1 = new CodeTree();
        CodeTree codeTree = new CodeTree(id, level);
        System.out.println("user " + codeTree1.id + " lv " + codeTree1.level);

        System.out.println("user " + codeTree.id + " lv " + codeTree.level);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


}