import java.util.*;
public class Main {
    public static final int MAX_N = 15;
    public static char[][] map = new char[MAX_N][MAX_N];
    public static int r,c;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        r = sc.nextInt(); 
        c = sc.nextInt();
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++){
                map[i][j] = sc.next().charAt(0);
            }
                
            
        int cnt = 0;
        for(int i = 1; i < r ; i++)
            for(int j = 1; j < c; j++)
                for(int k = i + 1; k < r - 1; k++)
                    for(int l = j + 1; l < c - 1; l++)
                        if(map[0][0] != map[i][j] &&
                           map[i][j] != map[k][l] &&
                           map[k][l] != map[r-1][c-1])
                           cnt++;
                    
        
        System.out.print(cnt);
    }
}