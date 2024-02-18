import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class Point {
        int num;
        int cnt1;
        int cnt2;

        public Point(int num, int cnt1, int cnt2) {
            this.num = num;
            this.cnt1 = cnt1;
            this.cnt2 = cnt2;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "num=" + num +
                    ", cnt1=" + cnt1 +
                    ", cnt2=" + cnt2 +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        Point arr[] = new Point[N];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int cnt1 = Integer.parseInt(st.nextToken());
            int cnt2 = Integer.parseInt(st.nextToken());

            arr[i] = new Point(num, cnt1, cnt2);
        }

        int cnt = 0;

//        System.out.println(Arrays.toString(arr));

        //숫자가 동일한 자리이다 -> 카운트 1, 숫자만 같다 => 카운트 2

//        valid(arr, 174, N);

        for (int i = 100; i < 1000; i += 100) {
            for (int j = 10; j < 100; j += 10) {
                for (int k = 1; k < 10; k++) {

                        int res = i + j + k;

                        String str = String.valueOf(res);

                        if(str.charAt(0) != str.charAt(1) && str.charAt(1) != str.charAt(2) && str.charAt(0) != str.charAt(2)) {

                            if (valid(arr, res, N)) {
//                                System.out.println("Success" + res);
                                cnt++;
                            }
                        }

                }
            }
        }
        sb.append(cnt);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static boolean valid(Point[] arr, int res, int N) {


        for (int i = 0; i < N; i++) {
            int cnt1 = 0;
            int cnt2 = 0;
            String str = String.valueOf(arr[i].num);
            String str2 = String.valueOf(res);
            if (str.substring(0, 1).equals(str2.substring(0, 1))) cnt1++;
            if (str.substring(1, 2).equals(str2.substring(1, 2))) cnt1++;
            if (str.substring(2, 3).equals(str2.substring(2, 3))) cnt1++;

//            System.out.println("arr" + arr[i].num + " " + res + " 1pass cnt " + cnt1 + " arr cnt " + arr[i].cnt1);

            if (cnt1 != arr[i].cnt1) {
                return false;
            }

//            System.out.println(str.substring(0,1).equals(str2.substring(0,1)));
//            System.out.println(str.contains(str2.substring(0,1)) && !str.substring(0,1).equals(str2.substring(0,1)));
//            System.out.println(str.contains(str2.substring(1,2)) && !str.substring(1,2).equals(str2.substring(1,2)));
//            System.out.println(str.contains(str2.substring(2,3)) && !str.substring(2,3).equals(str2.substring(2,3)));

            if ((str.contains(str2.substring(0, 1)) && !str.substring(0, 1).equals(str2.substring(0, 1)))
                    || (str.contains(str2.substring(1, 2)) && !str.substring(1, 2).equals(str2.substring(1, 2)))
                    || (str.contains(str2.substring(2, 3)) && !str.substring(2, 3).equals(str2.substring(2, 3)))) {

                cnt2++;
            }

//            System.out.println("arr" + arr[i].num + " " + res + " 2pass cnt2 " + cnt2 + " arr cnt2 " + arr[i].cnt2);


            if (arr[i].cnt2 != cnt2) {
//                System.out.println("false " + res);
                return false;
            }
        }
//        System.out.println("res" + res);

        return true;
    }


}