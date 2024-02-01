import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class CodeTree implements Comparable<CodeTree>{

        int x;
        int number;

        public CodeTree(int x, int number) {
            this.x = x;
            this.number = number;
        }

        @Override
        public int compareTo(CodeTree o) {
            return this.x - o.x;
        }
    }

    public static void main(String[] args) throws IOException {


        int N = Integer.parseInt(br.readLine());

        CodeTree codeTree[] = new CodeTree[N];
        CodeTree codeTree2[] = new CodeTree[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            int x = Integer.parseInt(st.nextToken());

            codeTree2[i] = new CodeTree(x, i+1);
            codeTree[i] = new CodeTree(x, i+1);
        }

        Arrays.sort(codeTree);

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++) {
                if (codeTree2[i].number == codeTree[j].number) {
                    sb.append(j+1);
                    sb.append(" ");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }


}