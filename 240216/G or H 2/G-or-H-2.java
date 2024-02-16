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

        int arr[] = new int[101];

        int maxIdx = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            char sign = st.nextToken().charAt(0);

            maxIdx = Math.max(maxIdx, idx);

            if(sign == 'G'){
                arr[idx] = 1;
            }else{
                arr[idx] = 2;
            }
        }

//        System.out.println(Arrays.toString(arr));
        // G = 1; H = 2;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < 101; i++){

            for(int j = 0; j < 101; j++){
                int g = 0;
                int h = 0;
                int sum = 0;

                if(arr[i] == 0 || arr[j] == 0){
                    continue;
                }

//                System.out.println("Arrays" + i );
                for(int k = i; k < j+1; k++){
//                    System.out.print(arr[k] + " ");
                    if(arr[k] == 1){
                        g++;
                    }else if(arr[k] == 2){
                        h++;
                    }
                }

//                System.out.println("valid");

                if(g == h || h == 0 || g == 0){
//                    System.out.println(true);
                    max = Math.max(max, j - i);
                }

            }

        }
        if(N == 1){
            sb.append(0);
        }else {
            sb.append(max);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }



}