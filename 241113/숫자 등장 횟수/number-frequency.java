import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        HashMap<Integer, Integer> hs = new HashMap<>();
        int arr[];

        // 원소의 개수
        int n = sc.nextInt();
        // 질의의 수
        int m = sc.nextInt();

        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

            if(hs.containsKey(arr[i])){
                hs.put(arr[i],hs.get(arr[i]) + 1);
            }
            else {
                hs.put(arr[i], 1);
            }
        }

        for(int i = 0; i < m; i++){
            int num = sc.nextInt();
            if(hs.get(num) == null){
                System.out.print(0+ " ");
            }else {
                System.out.print(hs.get(num) + " ");
            }
        }




    }

}
