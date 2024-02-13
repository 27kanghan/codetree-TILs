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

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){


            for(int j = 0; j < N; j++){
                int sum = 0;

                if(i == 0){
                    if(j == i || j == i+1){
                        continue;
                    }
                }
                else if(i == N-1){
                    if(j == i || j == i-1){
                        continue;
                    }
                }
                else{
                    if(j == i || j == i-1 || j == i+1){
                        continue;
                    }
                }
                

                sum += arr[i] + arr[j];

                max = Math.max(sum, max);

            }


        }

        sb.append(max);



        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}