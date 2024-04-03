import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {


        int N = Integer.parseInt(br.readLine());

        int arr[][] = new int[N][N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N-2; i++){
            int cost = 0;
            for(int j = 0; j < N-2; j++){


                cost = getCost(arr,i,j);
                max = Math.max(cost, max);

            }


        }



        sb.append(max);


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int getCost(int[][] arr, int i, int j) {
        int cost = 0;
//        int max = Integer.MIN_VALUE;

//        System.out.println(i + " " + j);
        for(int n = i; n < i+3; n++){
            for(int m = j; m < j+3; m++){
                if(arr[n][m] == 1){
                    cost++;
                }
            }
//            System.out.println("cost" + cost);
//            max = Math.max(cost, max);
//            System.out.println("max" + max);
        }

        return cost;
    }
}