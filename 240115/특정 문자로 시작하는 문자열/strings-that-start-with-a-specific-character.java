import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        String arr[] = new String[n];

        for(int i = 0; i < n; i ++){
            st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
        }

        String str = br.readLine();

        double sum = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(arr[i].charAt(0) == str.charAt(0)){
                sum+= arr[i].length();
                cnt++;
            }
        }

        double avg = sum / cnt;

        sb.append(cnt);
        sb.append(" ");
        sb.append(String.format("%.2f", avg));

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}