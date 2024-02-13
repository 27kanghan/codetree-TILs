import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        boolean flags = false;
        int num = 0;
        int max = Integer.MIN_VALUE;

        char arr[] = new char [str.length()];

        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)-'0' == 0){
                flags = true;
            }
        }

        if(!flags) {
            arr[str.length()-1] = '0';
            String newStr = String.valueOf(arr);
            num = change(newStr);
            sb.append(num);
        }else{


            for(int i = 1; i < str.length(); i++){
                if(arr[i] == '0'){
                    arr[i] = '1';


                String newStr = String.valueOf(arr);

                int sum = change(newStr);

                max = Math.max(max, sum);

                arr[i] = '0';
                }
            }
            sb.append(max);
        }



        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int change(String str) {

        int sum = 0;
        int cnt = 0;

        for(int i = str.length()-1; i >= 0; i--){
            sum += (Math.pow(2,cnt)) * (str.charAt(i) - '0');
            cnt++;
        }

        return sum;
    }
}