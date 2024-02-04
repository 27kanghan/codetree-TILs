import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        int K = 5000;
        int arr[] = new int[100001];

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String color = st.nextToken();

            while(num-- > 0){
                if(color.equals("R")){
                    arr[K] = 1;
                    if(num > 0) K++;
                }

                if(color.equals("L")){
                    arr[K] = 2;
                    if(num > 0) K--;
                }
            }


        }

        int whiteCnt = 0;
        int blackCnt = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                blackCnt++;
            }else if(arr[i] == 2){
                whiteCnt++;
            }

        }

        sb.append(whiteCnt + " " + blackCnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }



}