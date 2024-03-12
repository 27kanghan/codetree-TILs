import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        int num = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
//|| !str.equals("pop_back")
            String str = (st.nextToken());
            if(str.equals("push_back") || str.equals("get") ) {
                num = Integer.parseInt(st.nextToken());
            }
//            System.out.println(i);

            int size = list.size();
//            System.out.println("size" + size);

            if(str.equals("push_back")){
                list.add(num);
            }else if(str.equals("pop_back")){
                list.remove(list.get(size-1));
            }else if(str.equals("size")){
                sb.append(list.size());
                sb.append("\n");
            }else{
                sb.append(list.get(num-1));
                sb.append("\n");
            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();



    }
}