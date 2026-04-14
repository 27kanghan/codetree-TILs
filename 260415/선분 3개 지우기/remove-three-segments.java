import java.util.Scanner;

public class Main {
    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Point arr[] = new Point[N];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = new Point(x,y);
        }

        int answer = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k< N; k++) {
                    
                    int map[] = new int[101];
                    boolean flags = false;

                    for (int a = 0; a < N; a++) {
                        if (a == i || a == j || a == k) continue;

                        for (int b = arr[a].x; b < arr[a].y +1; b++ ){
                            map[b]++;
                        }

                    }

                    for (int a = 0; a < 101; a++) {
                        if(map[a]>1) flags = true;
                    }
                    if(!flags) answer++;
                }
                
            }
        }
        System.out.println(answer);
    }
    
}