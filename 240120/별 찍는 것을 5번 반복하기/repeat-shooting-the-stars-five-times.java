import javax.management.StringValueExp;
import java.io.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        


        for(int i = 0;  i < 5; i++){
            printStar();
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


    private static void printStar(){
        for(int i = 0; i < 10; i++){
            sb.append("*");
        }
        sb.append("\n");
    }

}