import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int height[] = new int[N];
        int count[] = new int[N];

        for(int i = 0; i< N; i++){
            height[i] = Integer.parseInt(br.readLine());
        }


        int res = 0;
        int totalCnt = 0;
        int minIdx = 0;
        int maxIdx = 0;
        while(true){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < N; i++){
                if(min >= height[i]) {
                    minIdx = i;
                    min = height[i];
                }
                if(max <= height[i]){
                    maxIdx = i;
                    max = height[i];
                }
            }
            if(max - min <= 17){
                for(int i = 0; i < N; i++){
                    res += count[i] * count[i];
                }
                break;
            }

            if(totalCnt % 2 == 0){
                height[minIdx]++;
                count[minIdx]++;
            }else{
                height[maxIdx]--;
                count[maxIdx]++;
            }
            totalCnt++;
            

        }

        sb.append(res);

        bw.write(sb.toString());
        bw.flush();
        bw.close();



    }
}