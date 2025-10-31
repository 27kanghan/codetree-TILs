import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int offset = 1000;

        int arr[][] = new int[offset*2][offset*2];
        
        for (int i = 0; i < 2; i++) {
            int x1 = sc.nextInt() + offset;
            int y1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;
            int y2 = sc.nextInt() + offset;

            for(int a = x1; a < x2; a++){
                for (int b = y1; b < y2; b++){
                    if(i == 1) arr[a][b] = 0;
                    else arr[a][b] = 1;
                }
            }
        }


        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        int area = 0;
         for(int i = 0; i < offset*2; i++){
            for(int j = 0; j < offset*2; j++){
                if(arr[i][j] == 1) {
                    area +=1;
                }
            }
        }

        for(int i = 0; i < offset*2; i++){
            for(int j = 0; j < offset*2; j++){
                if(arr[i][j] == 1) {
                    minX = i;
                    minY = j;
                }
            }
        }


        

        for(int i = offset*2-1; i > -1; i--){
            for(int j = offset*2-1; j > -1; j--){
                if(arr[i][j] == 1) {
                    maxX = i;
                    maxY = j;
                }
            }

        }

        //  System.out.println(maxX + " " + maxY + " " + minX + " " + minY);

        int answer = (maxX-minX -1) * (maxY-minY - 1);

        System.out.println(answer);



    }
}