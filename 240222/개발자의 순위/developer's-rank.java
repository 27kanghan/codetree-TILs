import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int arr[][] = new int[K][N];

        for(int i = 0; i < K; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        int cnt = 0;
        for(int i = 0; i < N; i++){
            int num = arr[0][i];
            boolean check[] = new boolean[N+1];
            Arrays.fill(check, true);

            for(int r = 0; r < K; r++){

                int idx = 0;
                for(int c = 0; c < N; c++){
                    if(arr[r][c] == num){
                        idx = c + 1;
                    }
                }

                check[idx] = false;
                check[0] = false;

                for(int c = 0; c < N; c++){




                    if(arr[r][c] != num){
                        if(c < idx){
                            check[arr[r][c]] = false;
                        }
                    }
                }


            }
//            System.out.println(Arrays.toString(check));


            for(int k = 1; k < N+1; k++){
                if(check[i]){
                    cnt++;
                }
            }


        }


        sb.append(cnt);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}