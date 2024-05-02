import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static List<Integer> answer = new ArrayList<>();

    static int arr[][];

    static boolean isVisited[];

    static int N, max;



    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

//        isVisited = new boolean[N+1];

        max = Integer.MIN_VALUE;

        arr = new int [N][N];
        isVisited = new boolean[N];

//        int cnt = 0;

        for(int i = 0; i < N; i++){
          st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
//        System.out.println(Arrays.toString(arr));

        combination(0);
        sb.append(max);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void combination(int cnt) {
        if(cnt == N){
//            System.out.println("print");
//            print();
            int sum = 0;
            for(int i = 0; i < N; i++){
                sum += arr[i][answer.get(i)];
            }
            max = Math.max(max, sum);
            return;
        }

        for(int i = 0; i < N; i++){
            if(isVisited[i]) continue;
            answer.add(i);
            isVisited[i] = true;
            combination(cnt+1);
            isVisited[i] = false;
            answer.remove(answer.size()-1);
        }
    }
    

    private static void print() {
//        System.out.println(1);
        for (int i = 0; i < N; i++) {
            sb.append(answer.get(i));
            sb.append(" ");
        }sb.append("\n");
    }


}