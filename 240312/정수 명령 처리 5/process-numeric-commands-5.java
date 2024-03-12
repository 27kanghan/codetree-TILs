import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {


        List<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            String str = st.nextToken();
            int num = 0;
            if(str.equals("push_back") || str.equals("get")){
                num = Integer.parseInt(st.nextToken());
            }


            if(str.equals("push_back")){
                list.add(num);
            }else if(str.equals("pop_back")){
                list.remove(list.size()-1);
            }else if(str.equals("size")){
                System.out.println(list.size());
            }else if(str.equals("get")){
                System.out.println(list.get(num-1));
            }

//            for(int j = 0; j < list.size(); j++){
//                System.out.printf(list.get(j) + " ");
//            }
//
//            System.out.println("size" + list.size());

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();



    }
}