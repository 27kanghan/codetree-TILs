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

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = -1;
        

        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                for(int k = j+1; k < N; k++){
                    int sum = 0;
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];

                    if(isCarry(a,b,c)){
                        
                        sum = a+b+c;
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        sb.append(max);




        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isCarry(int a, int b, int c) {

        while(true){
            if(a == 0 && b == 0 && c == 0){
                break;
            }

            int sum = 0;

            sum = (a % 10) + (b % 10) + (c % 10);


            if(sum > 9) return false;

            a = a / 10;
            b = b / 10;
            c = c / 10;

        }


        return true;
    }

}