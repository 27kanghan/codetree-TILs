import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        int n = Integer.parseInt(st.nextToken());

        char arr[] = str.toCharArray();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            char index;
            switch (num){
                case 1 :
//                    str = str.substring(1, str.length()) + str.substring(0,1);
                    index = arr[0];
                    for(int j = 0; j < arr.length -1 ; j++){
                        arr[j] = arr[j+1];
                    }
                    arr[arr.length-1] = index;
                    break;
                case 2 :
                    index = arr[arr.length-1];
                    for(int j = arr.length-1; j > 0 ; j--){
                        arr[j] = arr[j-1];
                    }
                    arr[0] = index;
                    break;
                case 3 :
                    char copy[] = new char[arr.length];

                    for(int j = 0; j < arr.length; j++){
                        copy[j] = arr[j];
                    }


                    for(int j = 0 ; j < arr.length; j++){
                        arr[j] = copy[arr.length-1-j];
                    }

                    break;
            }
            sb.append(String.valueOf(arr));
            sb.append("\n");


        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}