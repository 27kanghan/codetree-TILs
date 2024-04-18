import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N, M, Q;
    static int arr[][];

    static boolean up = true;
    static boolean down = true;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());

            int row = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);

            up = true;
            down = true;

//            System.out.println("start move row" + row);

            move(row - 1, dir);
            // 옮긴 후에는 검증하자.
            // 위에 쭉, 아래 쭉 하기
//            System.out.println("movedone");
            validDown(row-1, dir);
            validUp(row-1, dir);

//            System.out.println("one turn is done");

        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(arr[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    static void move(int row, char dir) {

        // 배열 하나 만들고 거기에 담은 다음에~~~ 옮기기.
        int forMove[] = new int[M];
        // 왼쪽일 시
        // 1 2 3 4 5 ->
        // 5 1 2 3 4
        // 오른쪽 일 시
        // 1 2 3 4 5 ->
        // 2 3 4 5 1
        if (dir == 'L') {
            int temp = arr[row][M - 1];

            for (int i = 1; i < M; i++) {
                forMove[i] = arr[row][i - 1];
            }
            forMove[0] = temp;

            for (int i = 0; i < M; i++) {
                arr[row][i] = forMove[i];
            }

        } else {
            int temp = arr[row][0];

            for (int i = 1; i < M; i++) {
                forMove[i - 1] = arr[row][i];
            }
            forMove[M - 1] = temp;

            for (int i = 0; i < M; i++) {
                arr[row][i] = forMove[i];
            }
        }

//        System.out.println(row + " " + dir);

//        print(arr);




    }



    private static void validDown(int row1, char dir) {
        boolean isDuplicate = false;
        char newDir = dir;
        int row = row1;

        while(true){

            if(newDir == 'L'){
                newDir = 'R';
            }else{
                newDir = 'L';
            }


            if(row-1 < 0) break;
//            System.out.println("row" + row);
            isDuplicate = false;

            for(int i = 0; i < M; i++){
                if(arr[row][i] == arr[row-1][i]){
                    isDuplicate = true;
                    break;
                }
            }


            if(!isDuplicate) break;



            int forMove[] = new int[M];

            if (newDir == 'L') {
                int temp = arr[row-1][M - 1];

                for (int i = 1; i < M; i++) {
                    forMove[i] = arr[row-1][i - 1];
                }
                forMove[0] = temp;

                for (int i = 0; i < M; i++) {
                    arr[row-1][i] = forMove[i];
                }

            } else {
                int temp = arr[row][0];

                for (int i = 1; i < M; i++) {
                    forMove[i - 1] = arr[row-1][i];
                }
                forMove[M - 1] = temp;

                for (int i = 0; i < M; i++) {
                    arr[row-1][i] = forMove[i];
                }
            }



//            System.out.println(row + " " + newDir);

            row = row - 1;

//            print(arr);

        }

    }

    private static void validUp(int row1, char dir) {
        boolean isDuplicate = false;
        char newDir = dir;
        int row = row1;
        while(true){
            if(row +1 >= N) break;
            isDuplicate = false;
            for(int i = 0; i < M; i++){
                if(arr[row][i] == arr[row+1][i]){
                    isDuplicate = true;
                    break;
                }
            }


            if(!isDuplicate) break;

            if(newDir == 'L'){
                newDir = 'R';
            }else{
                newDir = 'L';
            }

            int forMove[] = new int[M];

            if (newDir == 'L') {
                int temp = arr[row+1][M - 1];

                for (int i = 1; i < M; i++) {
                    forMove[i] = arr[row+1][i - 1];
                }
                forMove[0] = temp;

                for (int i = 0; i < M; i++) {
                    arr[row+1][i] = forMove[i];
                }

            } else {
                int temp = arr[row+1][0];

                for (int i = 1; i < M; i++) {
                    forMove[i - 1] = arr[row+1][i];
                }
                forMove[M - 1] = temp;

                for (int i = 0; i < M; i++) {
                    arr[row+1][i] = forMove[i];
                }
            }

            row = row + 1;

//            System.out.println(row + " " + newDir);
//
//            print(arr);

        }

    }



    private static void print(int[][] arr) {
        System.out.println("============");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}