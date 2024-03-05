import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = str.charAt(i) - '0';
        }

        int max = Integer.MIN_VALUE;
        boolean flags = false;
        for (int i = 1; i < N - 1; i++) {
            if (arr[i] == 1 && arr[i - 1] == 1 && arr[i + 1] == 1) {
                flags = true;
            }
        }

        if (!flags) {
            for (int i = 0; i < N; i++) {

                //사람 이미 있으면 쳐내
                if (arr[i] != 0) continue;

                int copy[] = new int[N];

                for (int c = 0; c < N; c++) {
                    copy[c] = arr[c];
                }

                //사람 앉혀
                copy[i] = 1;
                // System.out.println("i" + i);

                if (i == 0 && copy[i + 1] == 1) {
                    continue;
                } else if (i == N - 1 && copy[i - 1] == 1) {
                    continue;
                }
//                else if (i > 0 && i < N - 1 && (copy[i - 1] == 1 || copy[i + 1] == 1)) {
//                    continue;
//                }

//                System.out.println(Arrays.toString(copy));

                int diff = 0;

                int minDiff = Integer.MAX_VALUE;
                for (int j = 0; j < N-1; j++) {

                    if (copy[j + 1] == 0) {
                        diff++;
                    }
                    if(copy[j+1] == 1){
                        diff++;
                        minDiff = Math.min(minDiff, diff);
                        diff = 0;
                    }

                }


                max = Math.max(minDiff, max);

            }
        }

        if (flags) {
            sb.append(1);
        } else {
            sb.append(max);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


}