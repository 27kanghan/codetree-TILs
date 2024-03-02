import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class Point {
        int x;
        int y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());


        Point arr[] = new Point[N];

        int max = Integer.MIN_VALUE;


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new Point(x, y);

            max = Math.max(max, Math.max(y, x));

        }

        int val = 0;

        boolean res = false;

        String dir[] = {"xxx", "xxy", "xyx", "yxx", "xyy", "yxy", "yyx", "yyy"};
        boolean flags2 = false;
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                for (int k = 0; k <= 10; k++) {


                    for (int d = 0; d < 8; d++) {
                        boolean flags = false;
                        for (int n = 0; n < N; n++) {
                            int x = arr[n].x;
                            int y = arr[n].y;
                            if (d == 0) {
                                if (i == x || j == x || k == x) flags = true;
                                else {
                                    flags = false;
                                    break;
                                }
                            } else if (d == 1) {
                                if (i == x || j == x || k == y) flags = true;
                                else {
                                    flags = false;
                                    break;
                                }
                            } else if (d == 2) {
                                if (i == x || j == y || k == x) flags = true;
                                else {
                                    flags = false;
                                    break;
                                }
                            } else if (d == 3) {
                                if (i == y || j == x || k == x) flags = true;
                                else {
                                    flags = false;
                                    break;
                                }
                            } else if (d == 4) {
                                if (i == y || j == y || k == x) flags = true;
                                else {
                                    flags = false;
                                    break;
                                }
                            } else if (d == 5) {
                                if (i == y || j == x || k == y) flags = true;
                                else {
                                    flags = false;
                                    break;
                                }
                            } else if (d == 6) {
                                if (i == x || j == y || k == y) flags = true;
                                else {
                                    flags = false;
                                    break;
                                }
                            } else {
                                if (i == y || j == y || k == y) flags = true;
                                else {
                                    flags = false;
                                    break;
                                }
                            }
                        }
                        if (flags) {
                            flags2 = true;
                            val = 1;
                            break;
                        }
                    }
                    if (flags2) {
                        break;
                    }


                }
                if (flags2) {
                    break;
                }
            }
            if (flags2) {
                break;
            }
        }


        sb.append(val);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


}