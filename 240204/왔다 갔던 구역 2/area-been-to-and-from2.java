import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        int arr[] = new int [201];

        int N = Integer.parseInt(br.readLine());

        int idx = 100;

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

        int cnt = 0;
        for(int i = 0; i < 201; i++) {
            if(arr[i] >= 2){
                cnt++;
            }
        }

        sb.append(cnt);


        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }



}