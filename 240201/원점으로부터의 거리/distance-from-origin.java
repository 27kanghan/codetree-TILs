import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class CodeTree implements Comparable<CodeTree>{

        int x;
        int y;
        int number;

        public CodeTree(int x, int y, int number) {
            this.x = x;
            this.y = y;
            this.number = number;
        }

        @Override
        public int compareTo(CodeTree o) {
            return Math.abs(this.x+this.y) - Math.abs(o.x + o.y);
        }
    }

    public static void main(String[] args) throws IOException {


        int N = Integer.parseInt(br.readLine());

        CodeTree codeTree[] = new CodeTree[N];

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            codeTree[i] = new CodeTree(x,y, i+1);
        }

        Arrays.sort(codeTree);

        for(int i = 0; i < N; i++){
            System.out.println(codeTree[i].number);
        }


    }


}