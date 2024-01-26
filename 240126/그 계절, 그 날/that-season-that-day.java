import java.io.*;

import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int dayOfMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int year = Integer.parseInt(st.nextToken());

        int month = Integer.parseInt(st.nextToken());

        int day = Integer.parseInt(st.nextToken());

        valid(year);

        if(month >= 1 && month <= 12 && day >= 1 && day <= dayOfMonth[month-1]){
            if(month >= 3 && month <= 5){
                sb.append("Spring");
            }else if(month >=6 && month <= 8){
                sb.append("Summer");
            }else if(month >= 9 && month <= 11){
                sb.append("Fall");
            }else{
                sb.append("Winter");
            }
        }else{
            sb.append(-1);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void valid(int year) {

        if((year % 4 == 0 && year % 100 == 0)){
            dayOfMonth[1] = 28;
        }
        else if( year % 4 == 0 || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)){
            dayOfMonth[1] = 29;
        }else{
            dayOfMonth[1] = 28;
        }
    }


}