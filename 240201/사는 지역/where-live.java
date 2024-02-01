import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class CodeTree {

        String name;
        String phoneNumber;
        String area;

        public CodeTree(String name, String phoneNumber, String area) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.area = area;
        }

        @Override
        public String toString() {
            return "CodeTree{" +
                    "name='" + name + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", area='" + area + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        CodeTree codeTree[] = new CodeTree[N];
        String name1[] = new String[N];


        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String phoneNumber = st.nextToken();
            String area = st.nextToken();
            name1[i] = name;
            codeTree[i] = new CodeTree(name, phoneNumber, area);
        }


        Arrays.sort(name1);


        int idx = 0;

        for(int i = 0; i < N; i++){
            if(name1[N-1].equals(codeTree[i].name)){
                idx = i;
            }
        }

        System.out.println("name " + codeTree[idx].name);
        System.out.println("addr " + codeTree[idx].phoneNumber);
        System.out.println("city " + codeTree[idx].area);











    }


}