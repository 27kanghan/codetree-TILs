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

        int cnt = 0;

        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                double avg = 0;
                double sum = 0;
                int ncnt = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                    ncnt++;

                }


                avg = sum / ncnt;
                for(int k = i; k <= j; k++){
                    if(arr[k] == avg){
                        cnt++;
                        break;
                    }
                }
            }

        }


        sb.append(cnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }



}