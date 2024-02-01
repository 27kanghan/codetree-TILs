import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class CodeTree implements Comparable<CodeTree>{

        String name;
        int height;
        int weight;

        public CodeTree(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }



        @Override
        public String toString() {
            return name + " " + height + " " + weight;
        }

        @Override
        public int compareTo(CodeTree o) {
            if(this.height == o.height){
                return o.weight - this.weight;
            }
            return this.height - o.height;
        }
    }

    public static void main(String[] args) throws IOException {


        int N = Integer.parseInt(br.readLine());

        CodeTree codeTree[] = new CodeTree[N];

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            codeTree[i] = new CodeTree(name, height, weight);
        }

        Arrays.sort(codeTree);

        for(int i = 0; i < N; i++){
            System.out.println(codeTree[i].toString());
        }


    }


}