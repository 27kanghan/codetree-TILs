import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class CodeTree {

        String name;
        int score;

        public CodeTree(String name, int score){
            this.name = name;
            this.score = score;
        }
    }

    public static void main(String[] args) throws IOException {


        CodeTree codeTree[] = new CodeTree[5];


        for(int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            codeTree[i] = new CodeTree(name, score);
        }

        CodeTree min = new CodeTree("compare", Integer.MAX_VALUE);

        for(int i = 0; i<5; i++){
            if(codeTree[i].score < min.score){
                min = codeTree[i];
            }
        }

        System.out.println(min.name + " " + min.score);









    }


}