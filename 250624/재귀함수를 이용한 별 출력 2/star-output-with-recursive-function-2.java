import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        printStar(n, sb);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    public static void printStar(int n, StringBuilder sb) {

        if (n == 0) {
            return;
        }

        for (int i = 0; i < n; i++){
            sb.append("*");
            sb.append(" ");
            
        }
        sb.append("\n");

        printStar(n-1,sb);

          for (int i = 0; i < n; i++){
            sb.append("*");
            sb.append(" ");
           
        }
         sb.append("\n");
    }
}