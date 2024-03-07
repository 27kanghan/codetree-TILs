import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {


        // a+b, b+c, c+d, d+a, a+c, b+d, a+b+c,a+b+d, b+c+d, a+b+c+d

        //a <= b <= c <= d

        int N = 15;

        int arr[] = new int[15];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 15; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

//        System.out.println(Arrays.toString(arr));

        boolean flags = false;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    for (int l = k + 1; l < N; l++) {
                        if (valid(i, j, k, l, arr, N)) {
                            sb.append(arr[i]);
                            sb.append(" ");
                            sb.append(arr[j]);
                            sb.append(" ");
                            sb.append(arr[k]);
                            sb.append(" ");
                            sb.append(arr[l]);
                            flags = true;
                            break;
                        }
                    }
                    if (flags) break;
                }
                if (flags) break;
            }
            if (flags) break;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static boolean valid(int i, int j, int k, int l, int[] arr, int N) {

        // a+b, b+c, c+d, d+a, a+c, b+d, a+b+c,a+b+d, b+c+d, a+b+c+d
        int a = arr[i];
        int b = arr[j];
        int c = arr[k];
        int d = arr[l];

        int sum[] = {a + b, b + c, c + d, d + a, a + c, b + d, a + b + c, a + b + d, b + c + d, a + b + c + d};

//        System.out.println(Arrays.toString(sum));


        for (int x = 0; x < sum.length; x++) {
            boolean flags = false;
            for (int z = 0; z < N; z++) {
                if(z == i || z == j || z == k || z == l) continue;
                if (sum[x] == arr[z]) {
                    flags= true;
                }
            }
            if(!flags) return false;
        }


        return true;
    }

}