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

        int arr[][] = new int[N][N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 가로


        int res = 0;

//        System.out.println("가로");
        //가로
        for(int i = 0; i < N; i++){
            int cnt = 1;
            for(int j = 1; j < N; j++){
                //연속된 수 있으면 ㅇㅋ

                //연속되고있는지 검사
                if(arr[i][j] == arr[i][j-1]){
                    cnt++;
                }else{
                    cnt = 1;
                }

//                System.out.println("i+j = " +  i + " " + j);

//                System.out.println(cnt);

                if(cnt >= M){
//                    System.out.println("일치");
                    res++;
                    break;
                }

            }
        }
//        System.out.println(res);

//        System.out.println("세로");
        //세로
        for(int i = 0; i < N; i++){
            int cnt = 1;
            for(int j = 1; j < N; j++){
                //연속된 수 있으면 ㅇㅋ


                //연속되고있는지 검사
                if(arr[j][i] == arr[j-1][i]){
                    cnt++;
                }else{
                    cnt = 1;
                }

                if(cnt >= M){
//                    System.out.println("일치");
                    res++;
                    break;
                }
//                System.out.println(cnt);

            }
        }

        if(N == 1){
            res = 2;
        }


        sb.append(res);


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}