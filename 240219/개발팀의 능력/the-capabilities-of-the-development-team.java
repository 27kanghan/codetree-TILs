import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int arr[] = new int[5];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 5; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int res = 0;

        int minRes = Integer.MAX_VALUE;


        for(int i = 0; i < 5; i++){
            for(int j = i+1; j < 5; j++){
                int sum1 = arr[i] + arr[j];
                for(int k = 0; k < 5; k++){
                    for(int l = k+1; l < 5; l++) {
                        if (i != k && j != l && i != l && j != k) {
                            int sum2 = arr[k] + arr[l];
                            if(sum1 != sum2) {

                                int sum3 = 0;

                                for (int n = 0; n < 5; n++) {
                                    sum3 += arr[n];
                                }

                                sum3 -= sum1 + sum2;

                                if(sum3 != sum2) {
//                                    System.out.println(arr[i] + " " + arr[j] + " ");
//                                    System.out.println(arr[k] + " " + arr[l] + " ");
//
//                                    System.out.println(sum1 + " " + sum2 + " " + sum3);


                                    max = Math.max(sum1, Math.max(sum2, sum3));
                                    min = Math.min(sum1, Math.min(sum2, sum3));

                                    res = max - min;

//                                    System.out.println("res=" + res);


                                    minRes = Math.min(res, minRes);
                                }
                            }
                        }

                    }

                }
            }
        }

        sb.append(minRes);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}