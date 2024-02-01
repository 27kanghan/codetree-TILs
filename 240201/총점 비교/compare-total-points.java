import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class CodeTree implements Comparable<CodeTree>{

        String name;
        int kor;
        int eng;
        int math;

        public CodeTree(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public int compareTo(CodeTree o) {
            return (this.kor+this.eng+this.math) - (o.kor+o.eng+o.math);
        }

        @Override
        public String toString() {
            return name + " " + kor + " " + eng + " " + math;
        }
    }

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        CodeTree codeTree[] = new CodeTree[N];

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            codeTree[i] = new CodeTree(name,kor,eng,math);
        }

        Arrays.sort(codeTree);


        for(int i = 0; i < N; i++){
            System.out.println(codeTree[i].toString());
        }



    }


}