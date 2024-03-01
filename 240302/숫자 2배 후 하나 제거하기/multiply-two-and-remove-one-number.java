import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {


        int N = Integer.parseInt(br.readLine());


        int arr[] = new int[N];


        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){
            arr[i] = arr[i] * 2;

            for(int j = 0; j < N; j++){
                int newArr[] = new int[N-1];

                int cnt = 0;

                for(int k = 0; k < N; k++){
                    if(k!=j){
                        newArr[cnt++] = arr[k];
                    }
                }
//                System.out.println(Arrays.toString(newArr));

                int diff = 0;

                for(int k = 0; k < N-2; k++){
                    diff += Math.abs(newArr[k+1] - newArr[k]);
                }
//                System.out.println(diff);
                min = Math.min(min, diff);
            }

            arr[i] = arr[i] / 2;
        }




        sb.append(min);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}