import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        // N과 T가 주어진다..
        //T보다 큰 수로 이루어진 연속 부분 수열 중 최대 길이
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();

        int numArr[] = new int[N];

        for(int i = 0; i < N; i++){
            numArr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int i = 0; i < N; i++){
            if(numArr[i] > T) {
                // if(numArr[i+1] >= numArr[i]) {
                //     System.out.println(numArr[i] + " " + numArr[i+1] + " count" + count);
                //     count +=1;
                // }
                // else{
                //     count = 1;
                // }
            count+=1;
            }else{
                count = 0;
            }
            max = Math.max(max, count);
        }

        System.out.println(max);


    }
}