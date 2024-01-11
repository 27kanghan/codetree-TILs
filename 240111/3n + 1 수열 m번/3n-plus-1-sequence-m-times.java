import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            int cnt = 0;

            while(num != 1){
                if(num % 2 == 0){
                    num /= 2;
                }else{
                    num = num * 3 + 1;
                }

                cnt++;

            }

            sb.append(cnt);
            sb.append("\n");
        }




        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}