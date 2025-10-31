import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        //가로 세로 8,
        //offset

        int offset = 100;

        int arr [][] = new int[offset * 2][offset * 2];

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            int x = sc.nextInt() + offset;
            int y = sc.nextInt() + offset;

            for(int j = x; j < x+8; j++){
                for(int k = y; k < y+8; k++){
                    arr[j][k] = 1;
                }
            }

        }

        int answer = 0;

        for(int i = 0; i < offset*2; i++){
            for(int j =0; j < offset*2; j++){
                if(arr[i][j] == 1) answer++;
            }
        }



        System.out.println(answer);


    }
}