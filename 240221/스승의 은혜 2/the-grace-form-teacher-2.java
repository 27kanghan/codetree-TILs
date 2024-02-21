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

        int B = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){


            arr[i] = arr[i] / 2;
            int cost = 0;
            int cnt = 0;

            for(int j = 0; j < N; j++){

                cost += arr[j];
                cnt++;

                if(cost > B){
                    cost -= arr[j];
                    cnt--;
                }



            }

            max = Math.max(cnt,max);


            arr[i] = 2 * arr[i];
        }




        sb.append(max);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}