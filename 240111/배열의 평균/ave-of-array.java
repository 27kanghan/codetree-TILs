import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        double arr[][] = new double[2][4];

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 4; j++){
                arr[i][j] = Double.parseDouble(st.nextToken());
            }
        }

        double total = 0;

        for(int i = 0; i < 2; i++){
            double sum = 0;
            double avg1;
            for(int j = 0; j < 4; j++){
                sum += arr[i][j];
                total += arr[i][j];
            }

            avg1 = sum / 4;

            String res = String.format("%.1f", avg1);

            sb.append(res + " ");

        }

        sb.append("\n");

        for(int i = 0; i < 4; i++){
            double sum = 0;
            double avg1;
            for(int j = 0; j < 2; j++){
                sum += arr[j][i];
            }

            avg1 = sum / 2;

            String res = String.format("%.1f", avg1);

            sb.append(res + " ");

        }
        sb.append("\n");

        String res = String.format("%.1f", total/8);

        sb.append(res);



        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}