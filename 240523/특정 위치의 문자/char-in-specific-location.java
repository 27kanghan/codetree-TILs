import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//

        String arr[] = new String[6];

        arr[0] = "L";
        arr[1] = "E";
        arr[2] = "B";
        arr[3] = "R";
        arr[4] = "O";
        arr[5] = "S";

        String c = sc.next();

        int idx = -1;

        for(int i = 0; i < 6; i++){
            if(arr[i].equals(c)){
               idx = i;
            }
        }

        if(idx == -1){
            System.out.println("None");
        }else{
            System.out.println(idx);
        }


    }
}