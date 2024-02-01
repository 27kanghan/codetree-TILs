import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class CodeTree {

        String date;
        String day;
        String weather;

        public CodeTree(String date, String day, String weather) {
            this.date = date;
            this.day = day;
            this.weather = weather;
        }


    }

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        CodeTree codeTree[] = new CodeTree[N];
        String dateArr[] = new String[N];
        Arrays.fill(dateArr, "9999-99-99");

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String date = st.nextToken();
            String day = st.nextToken();
            String weather = st.nextToken();
            if(weather.equals("Rain")) {
                dateArr[i] = date;
            }
            codeTree[i] = new CodeTree(date, day, weather);
        }

        int idx = 0;

        Arrays.sort(dateArr);


        for(int i = 0; i<N; i++){
            if(dateArr[0].equals(codeTree[i].date)){
                idx = i;
            }
        }

        System.out.println(codeTree[idx].date + " " + codeTree[idx].day + " " + codeTree[idx].weather);











    }


}