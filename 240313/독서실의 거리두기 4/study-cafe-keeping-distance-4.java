import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int arr[];
    static int copy[];

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();

        arr = new int[N];
        copy = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = str.charAt(i)-'0';
        }

        //1. 2 장소 골라서 1 추가하기.
        //2. 1부터 다음 1까지 값 구하기.

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            if(arr[i] == 1) continue;
            for(int j = i+1; j < N; j++){
                if(arr[j] == 1) continue;
                copy(N);
                // 2군데 1로 만들기
                copy[i] = 1;
                copy[j] = 1;

                int min = getDistance(copy);

                max = Math.max(min, max);
//                System.out.println(Arrays.toString(copy));



            }
             // 배열 복사
        }


        sb.append(max);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static int getDistance(int[] copy) {

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < copy.length; i++){
            for(int j = i+1; j < copy.length; j++){
                int distance = 0;
                if(copy[i] == 1 && copy[j] == 1){
                    distance = j-i;
                    min = Math.min(min,distance);
                }
            }
        }

        return min;
    }

    private static void copy(int N) {

        for(int i = 0; i < N; i++){
            copy[i] = arr[i];
        }
    }
}