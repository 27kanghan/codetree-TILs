import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        // 500 미만의 수중 가장 큰 수,
        int max = Integer.MIN_VALUE;
        // 500 초과의 수중 가장 작은 수
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 10; i++){
            if(arr[i] < 500){
                max = Math.max(max, arr[i]);
            }

            if(arr[i] > 500){
                min = Math.min(min, arr[i]);
            }
        }

        sb.append(max);
        sb.append(" ");
        sb.append(min);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}