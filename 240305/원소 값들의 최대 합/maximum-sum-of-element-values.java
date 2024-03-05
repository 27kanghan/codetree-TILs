import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();



    public static void main(String[] args) throws IOException {


        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

        int arr[] = new int[N+1];

        st = new StringTokenizer(br.readLine());

        for(int i = 1; i < N+1; i++){
           arr[i] = Integer.parseInt(st.nextToken());
        }

        // System.out.println(Arrays.toString(arr));

        int max = Integer.MIN_VALUE;
        for(int i = 1; i < N+1; i++){
            int copy[] = new int[N+1];
            for(int k = 0; k < N+1; k++){
                copy[k] = arr[k];
            }
            // System.out.println("time:"+i);
            max = Math.max(swap(copy,i,M),max);
        }





        sb.append(max);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static int swap(int[] arr, int i,int M) {
        int sum = 0;

        int num = arr[i];
        int idx = i;


        for(int j = 0; j < M; j++){

            sum += num;

            num = arr[num];
        }

//        System.out.println("sum = " + sum);



        return sum;
    }


}