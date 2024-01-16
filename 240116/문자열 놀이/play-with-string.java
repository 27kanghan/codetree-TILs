import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        st = new StringTokenizer(br.readLine());

        String copy = st.nextToken();

        int n = Integer.parseInt(st.nextToken());


        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());

            if (a == 1) {
                int num1 = Integer.parseInt(st.nextToken()) - 1;
                int num2 = Integer.parseInt(st.nextToken()) - 1;

                char a1 = copy.charAt(num1);
                char a2 = copy.charAt(num2);

                char arr[] = copy.toCharArray();

                arr[num1] = a2;
                arr[num2] = a1;

                copy = String.valueOf(arr);

                sb.append(copy);

            } else {
                char c1 = st.nextToken().charAt(0);
                char c2 = st.nextToken().charAt(0);


                char arr[] = copy.toCharArray();

                for (int j = 0; j < copy.length(); j++) {
                    if (arr[j] == c1) {
                        arr[j] = c2;
                    }
                }

                copy = String.valueOf(arr);
                sb.append(copy);
            }

            sb.append("\n");

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}