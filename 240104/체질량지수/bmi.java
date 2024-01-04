import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        double height = Double.parseDouble(st.nextToken())/100;
        Double weight = Double.parseDouble(st.nextToken());

        int bmi = (int) (weight / (Math.pow(height,2)));

        sb.append(bmi);
        sb.append("\n");

        if(bmi >= 25){
            sb.append("Obesity");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}