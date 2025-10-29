import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.

        int offset = 1000;

        int arr [][] = new int[offset*2][offset*2];

        for(int i = 0; i < 3; i++){
            int x1 = sc.nextInt() + offset;
            int y1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;
            int y2 = sc.nextInt() + offset;

            for(int c = x1; c < x2; c++) {

                for(int r = y1; r < y2; r++){

                    if( i != 2 ) {
                        arr[c][r] = 1;
                    }
                    else {
                        arr[c][r] = 0;
                    }
                }

            }

        }

        int answer = 0;

        for(int i = 0; i < offset*2; i++){
            for(int j = 0; j < offset*2; j++){
                if(arr[i][j] == 1) answer +=1;
            }
        }

        System.out.println(answer);


    }
}