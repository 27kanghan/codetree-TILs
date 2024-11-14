
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

//        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<String,Integer> hs = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            String word = br.readLine();


            if(!hs.containsKey(word)){
                hs.put(word, 1);
                max = Math.max(hs.get(word), max);
                continue;
            }


            hs.put(word, hs.get(word)+1);
            // System.out.println(hs.get(word));

            max = Math.max(hs.get(word), max);
        }

        sb.append(max);

        bw.write(sb.toString());
        bw.flush();
        bw.close();







    }

}
