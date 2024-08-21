import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        //N개의 원소를 배열에 담는다.
        //정렬 시작
        // 1. while문 vs 2중for문
        // 2. 1번째 원소부터 시작해서 다음게 자기랑 작은거(최소값) 찾아서 작으면 바꿈.
        // 2중 for문이면 충분하다.
        //

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N ;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            int min = arr[i];
            for(int j = i+1; j < N; j++){
                if(arr[j] < min){
                    int minIdx = j;
                    min = arr[j];
                    int temp = arr[i];
                    arr[i] = min;
                    arr[minIdx] = temp;
                }
            }
        }

        for(int i = 0; i < N; i++){
            sb.append(arr[i]);
            sb.append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
