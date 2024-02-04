import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();





    public static void main(String[] args) throws IOException {

        int arr[] = new int [2001];
        int count[] = new int[2001];


        int N = Integer.parseInt(br.readLine());

        int idx = 1000;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();
            switch (dir) {
                case "R":
                    for (int j = idx; j < idx+num; j++) {
                        arr[j]++;
                    }
                    idx += num;
                    break;
                case "L":
                    for (int j = idx-1; j >= idx-num; j--) {
                        arr[j]++;
                    }
                    idx -= num;
                    break;

            }
        }

        int white = 0;
        int black = 0;
        int gray = 0;
        for(int i = 0; i < 2001; i++) {
            if(arr[i] >= 4){
                gray++;
                continue;
            }

            if(arr[i] != 0 && arr[i] % 2 != 0){
                white++;
            }else if(arr[i] != 0 && arr[i] % 2 == 0){
                black++;
            }

        }
        sb.append(white);
        sb.append(" ");
        sb.append(black);
        sb.append(" ");
        sb.append(gray);
        sb.append(" ");



        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }



}