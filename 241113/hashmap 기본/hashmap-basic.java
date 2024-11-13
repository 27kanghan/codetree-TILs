import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

         Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hs = new HashMap<>();

        int n = sc.nextInt();




        for(int i = 0; i < n; i++){
            String order = sc.next();
            int key = 0;
            int value = 0;

                if(order.equals("add")){
                    key = sc.nextInt();
                    value = sc.nextInt();
                    hs.put(key,value);
                }else if(order.equals("find")){
                    key = sc.nextInt();
                    if(hs.get(key) == null){
                        System.out.println("None");
                    }else {
                        System.out.println(hs.get(key));
                    }
                }else{
                    key = sc.nextInt();
                    hs.remove(key);
                }
        }

    }
}