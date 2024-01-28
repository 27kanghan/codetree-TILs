import java.io.*;

import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int arr[] ;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sb.append(func(M));


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static int func(int m) {


        int sum = 0;

        while(m > 0){

            sum+= arr[m-1];

            if(m % 2 == 0){
                m /= 2;
            }else{
                m -= 1;
            }



        }


        return sum;
    }


}