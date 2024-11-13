import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        HashMap<Integer, Integer> hs = new HashMap<>();
        int numCount[];

        // 원소의 개수
        int n = sc.nextInt();
        // 질의의 수
        int m = sc.nextInt();

        numCount = new int[n];

        for(int i = 0 ; i < n; i++){
            int num = sc.nextInt();
            numCount[num]++;
            hs.put(num, numCount[num]);
        }


        for(int i = 0; i < m; i++){
            int num = sc.nextInt();
            if(hs.get(num) == null){
                System.out.println(0);
            }else {
                System.out.print(hs.get(num) + " ");
            }
        }




    }

}
