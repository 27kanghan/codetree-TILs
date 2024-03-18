import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N-1];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N-1; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean isVisited[];
        int res[];

        for(int i = 1; i < arr[0]; i++){

            isVisited = new boolean[N+1];

            int num = arr[0] - i;

            res = new int[N];

            res[0] = num;
            res[1] = i;

            isVisited[num] = true;

            if(isVisited[i]) continue;
            isVisited[i] = true;

//            System.out.println(Arrays.toString(res));

            num = i;

            int cnt = 1;

            for(int j = 1; j < N-1; j++){
                num = res[cnt];
                int num2 = arr[j] - num;
//                System.out.println("num" + num);
//                System.out.println("num2" + num2);

                if(num2 > N || num2 < 1) {
//                    System.out.println("over");
                    break;
                }

                if(isVisited[num2]) {
//                    System.out.println("isvisited");
                    break;
                }
                isVisited[num2] = true;

                res[++cnt] = num2;
            }

            if(cnt == N-1){
                for(int j = 0; j < N; j++){
                    sb.append(res[j]);
                    sb.append(" ");
                }
            }

//            System.out.println("cnt" + cnt);
//            System.out.println(Arrays.toString(res));


        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}