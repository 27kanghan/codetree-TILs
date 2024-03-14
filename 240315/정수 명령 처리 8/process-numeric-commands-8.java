import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        LinkedList<Integer> list = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            String str = st.nextToken();
            int num = 0;
            if(str.equals("push_back") || str.equals("push_front")){
                num = Integer.parseInt(st.nextToken());
            }

            if(str.equals("push_front")){
                list.addFirst(num);
            }else if(str.equals("push_back")){
                list.addLast(num);
            }else if(str.equals("pop_front")){
                System.out.println(list.pollFirst());
            }else if(str.equals("pop_back")){
                System.out.println(list.pollLast());
            }else if(str.equals("size")){
                System.out.println(list.size());
            }else if(str.equals("empty")){
                if(list.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(str.equals("front")){
                System.out.println(list.peekFirst());
            } else if (str.equals("back")) {
                System.out.println(list.peekLast());
            }

        }

    }


}