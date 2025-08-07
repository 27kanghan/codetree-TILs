import java.util.*;

public class Main {
    static class Students implements Comparable<Students>{

        String name;
        int height;
        int weight;

        public Students(String name, int height, int weight){
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Students students) {
            return this.height - students.height;            
        }
    }

    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();
       
       String name = "";
       int height = 0;
       int weight = 0;


        Students students[] = new Students[N];

        for (int i = 0; i < N; i++) {
            
        name = sc.next();
        height = sc.nextInt();
        weight = sc.nextInt();

        students[i] = new Students(name, height, weight);

        }

        Arrays.sort(students);

        for (int i = 0; i < N; i ++){

            System.out.println(students[i].name + " " + students[i].height + " " + students[i].weight);
        }


    }
}