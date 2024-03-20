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


        //bubble sort
        while(true){
            boolean sorting = true;

            for(int i = 0; i < N-1; i++){
                if(arr[i] > arr[i+1]){
                    sorting = false;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }

            if(sorting) break;

        }


        for(int i = 0; i < N; i++){
            sb.append(arr[i] + " ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}