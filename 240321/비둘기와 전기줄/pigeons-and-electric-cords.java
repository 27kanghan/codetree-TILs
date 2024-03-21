import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        // 비둘기가 0에서 1로 이동하면 건너간다.
        // 비둘기 번호는 10번까지.

        int arr [] = new int[11];

        Arrays.fill(arr,-1);

        //arr가 0에서 1로, 1에서 0으로 바뀌면 res에 1씩 추가
        int res = 0;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int pigeon = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken());


            //맨 처음 위치 설정
            if(arr[pigeon] == -1){
                arr[pigeon] = location;
            }
            // 0일때
            else if(arr[pigeon] != location){
                res++;
                arr[pigeon] = location;
//                System.out.println(pigeon + "res++!");
            }

//            System.out.println(Arrays.toString(arr));


        }

        sb.append(res);
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}