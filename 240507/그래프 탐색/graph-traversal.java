import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static boolean visited[];


    static List<Integer>[] list;

    static int V, E,ans;
    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());



        list = new ArrayList[V+1];
        visited = new boolean[V+1];


        for(int i = 0; i < V+1; i++){
            list[i] = new ArrayList<>();
        }


        for(int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            list[start].add(end);
            list[end].add(start);

        }



        int rootV = 1;
        visited[rootV] = true;
        dfs(rootV);
        System.out.println(ans);



    }

    private static void dfs(int curV) {
        for(int cur = 0; cur < list[curV].size(); cur++){
            int currV = list[curV].get(cur);
            if(!visited[currV]){
//                System.out.println(currV);
                visited[currV] = true;
                ans++;
                dfs(currV);
            }
//            System.out.println("cut!");
        }
    }

}








//7 6
//1 2
//1 3
//1 4
//2 5
//4 6
//6 7