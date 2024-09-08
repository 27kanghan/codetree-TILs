import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        //0
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int arr[] = new int [n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = n-1; i >= 0 ; i--){
            if(arr[i] % 2 == 0){
                sb.append(arr[i]);
                sb.append(" ");
            }
        }



        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
