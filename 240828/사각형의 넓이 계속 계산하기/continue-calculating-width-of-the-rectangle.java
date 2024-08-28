import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
                
        
        while (true){
            
            int h = sc.nextInt();
            int w = sc.nextInt();
            
            String endWord = sc.next();

            System.out.println(h*w);
            
            if(endWord.equals("C")){
                break;
            }
            
        }



    }


}