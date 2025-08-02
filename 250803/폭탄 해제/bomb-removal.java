import java.util.*;



public class Main {
    static class Bomb {

    String code;
    String color;
    int second;

    public Bomb(String code, String color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;

    }

    // public static toString(){
    //     return "code : " + code + "\ncolor : " + color + "\nsecond : " + second;
    // }
}
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String color = sc.next();
        int second = sc.nextInt();

        Bomb bomb = new Bomb(code, color, second);

        System.out.println("code : " + bomb.code);
        System.out.println("color : " + bomb.color);
        System.out.println("second : " + bomb.second);





    }
}