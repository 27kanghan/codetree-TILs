import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        LinkedList<Character> l = new LinkedList<>();

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String str = br.readLine();

        for(int i = 0; i < N; i++){
            l.add(str.charAt(i));
        }

        ListIterator<Character> li = l.listIterator(l.size());

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            char a;

            if(c == 'L'){
                if(li.hasPrevious()){
                    li.previous();
                }
            }else if(c == 'R'){
                if(li.hasNext()){
                    li.next();
                }
            }else if(c == 'P'){
                a = st.nextToken().charAt(0);
                li.add(a);
            }else if(c == 'D'){
                if(li.hasNext()){
                    li.next();
                    li.remove();
                }
            }
        }

        li = l.listIterator();
        while(li.hasNext()){
            System.out.print(li.next());
        }

    }
}