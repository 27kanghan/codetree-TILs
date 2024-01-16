import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        st = new StringTokenizer(br.readLine());

        String str1 = st.nextToken();
        int arr[] = new int[str1.length()];

        char a = str1.charAt(0);
        char b = str1.charAt(1);

        char arr2[] = str1.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr2[i] == a && arr[i] == 0){
                arr2[i] = b;
                arr[i] = 1;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr2[i] == b && arr[i] == 0){
                arr2[i] = a;
                arr[i] = 1;
            }
        }

        String res = String.valueOf(arr2);



        sb.append(res);




        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}