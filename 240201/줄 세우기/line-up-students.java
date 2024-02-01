import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class CodeTree implements Comparable<CodeTree>{

        int height;
        int weight;
        int number;

        public CodeTree(int height, int weight, int number) {
            this.height = height;
            this.weight = weight;
            this.number = number;
        }

        @Override
        public int compareTo(CodeTree o) {
            if(this.height == o.height){
                if(this.weight == o.weight){
                    return this.number-o.number;
                }
                return o.weight - this.weight;
            }
            return o.height - this.height;
        }

        @Override
        public String toString() {
            return height + " " + weight + " " + number;
        }
    }

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        CodeTree codeTree[] = new CodeTree[N];

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            codeTree[i] = new CodeTree(height, weight, i+1);
        }

        Arrays.sort(codeTree);

        for(int i = 0; i < N; i++){
            System.out.println(codeTree[i].toString());
        }



    }


}