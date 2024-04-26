import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static List<Integer> answer = new ArrayList<>();
    static int K, N;
    static int max = Integer.MIN_VALUE;

    static int arr[];


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());

        arr = new int[K];

        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < K; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // System.out.println(Arrays.toString(arr));


        combi(0,0);

        System.out.println(max);


    }

    private static void combi(int cnt, int start) {

        if(cnt == N){
//            print();
            max = Math.max(max, xor());
            return;
        }

        for(int i = start; i < K; i++){
            answer.add(arr[i]);
            combi(cnt+1, i+1);
            answer.remove(answer.size()-1);

        }

    }

    private static int xor() {
        int xor = 0;

//        print();

        for(int i = 0; i < answer.size(); i++){
            xor ^= answer.get(i);
        }

//        System.out.println("xor = " + xor);

        max = Math.max(xor, max);

        return xor;
    }

    private static void print() {

        for(int i = 0; i < answer.size(); i++){
            System.out.print(answer.get(i) + " ");
        }
        System.out.println();

    }


}