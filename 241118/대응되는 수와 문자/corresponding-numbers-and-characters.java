
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

        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<String,Integer> hs = new HashMap<>();
        HashMap<Integer,String> hs2 = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            hs.put(str, i+1);
            hs2.put(i+1, str);

        }

        for(int i = 0; i < M; i++){
            //숫자 판단하기
            String str = br.readLine();

            if(isDigit(str)){
                sb.append(hs2.get(Integer.parseInt(str)));
            }else{
                sb.append(hs.get(str));
            }

            sb.append("\n");


        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();







    }

    public static boolean isDigit(String str){

        try{
            Double.parseDouble(str);
            return true;

        }catch (Exception e){
            return false;
        }

//        return false;
    }

}
