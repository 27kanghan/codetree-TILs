import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class CodeTree{

        String name;
        int height;
        double weight;

        public CodeTree(String name, int height, double weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return name + " " + height + " " + weight;
        }
    }

    public static void main(String[] args) throws IOException {



        CodeTree codeTree[] = new CodeTree[5];

        for(int i = 0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());

            codeTree[i] = new CodeTree(name, height, weight);
        }

        Arrays.sort(codeTree, (a,b)-> a.name.compareTo(b.name));

        System.out.println("name");
        for(int i = 0; i < 5; i++){
            System.out.println(codeTree[i].toString());
        }


        System.out.println();
        Arrays.sort(codeTree, (a,b)-> b.height-a.height);
        System.out.println("height");
        for(int i = 0; i < 5; i++){
            System.out.println(codeTree[i].toString());
        }




    }


}