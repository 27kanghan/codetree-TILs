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

        int arr[] = new int[N];
        int num[] = new int[M];
        boolean isSelect[] = new boolean[M];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }


        // arr 에서 하나 뽑아서 num 중에 있는지 확인. 있으면 체크
        // 3개 구간씩 보기

        int cnt = 0;
        for(int i = 0; i <= N-M; i++){
            for(int j = i; j < i+M; j++){
                //3개 구간에서 확인하기
                for(int k = 0; k < M; k++){
                    if(arr[j] == num[k] && !isSelect[k]){
                        isSelect[k] = true;
                        break;
                    }
                }

            }
            boolean flags = true;
            for(int k = 0; k < M; k++){
                if(!isSelect[k]){
                    flags = false;
                    break;
                }
            }

            if(flags) cnt++;

            Arrays.fill(isSelect, false);


        }




        sb.append(cnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }



}