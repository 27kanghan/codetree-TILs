import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class CodeTree {

        String productName;
        int cost;

        public CodeTree(){
            this.productName = "codetree";
            this.cost = 50;
        }

        public CodeTree(String productName, int cost){
            this.productName = productName;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        String code = st.nextToken();
        int time = Integer.parseInt(st.nextToken());


        CodeTree def = new CodeTree();
        CodeTree codeTree = new CodeTree(code, time);

        System.out.println("product "+ def.cost + " is " + def.productName);
        System.out.println("product "+ codeTree.cost + " is " + codeTree.productName);






    }


}