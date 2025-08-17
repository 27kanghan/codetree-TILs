import java.util.*;

public class Main {

    static class Students implements Comparable<Students>{
        int height;
        int weight;
        int number;

        public Students(int height, int weight, int number){
            this.height = height;
            this.weight = weight;
            this.number = number;
        }


        @Override
        public int compareTo(Students students){
            if (this.height == students.height) {

                if(this.weight == students.weight){
                    return this.number - students.number;
                }

                return students.weight - this.weight;
            }
            return students.height - this.height;
        }



    }

    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Students student [] = new Students[N];

        int number = 1;
        for(int i = 0; i < N; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();

            student[i] = new Students(height, weight, number++);
        }

        Arrays.sort(student);

        for (int i = 0; i < N; i++){
            System.out.println(student[i].height +" " + student[i].weight + " " + student[i].number);
        }

    }
}