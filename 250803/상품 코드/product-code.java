import java.util.*;

public class Main {

    static class Product {
        
        String name;
        int price;

        public Product(){
            this.name = "codetree";
            this.price = 50;
        }

        public Product(String name, int price){
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int price = sc.nextInt();

        Product p1 = new Product();
        Product p2 = new Product(name, price);

        System.out.println("product " + p1.price + " is " + p1.name);
        System.out.println("product " + p2.price + " is " + p2.name);


    }
}