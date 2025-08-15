import java.util.*;

public class Main {

    static class Students implements Comparable<Students>{
        String name;
        int kor;
        int eng;
        int math;

        public Students(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public int compareTo(Students students) {
            return (this.kor + this.eng + this.math) - (students.kor + students.eng + students.math);
        }
    }

    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        Students students[] = new Students[n];


        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            students[i] = new Students(name, kor, eng, math);

        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++) {
            System.out.println(students[i].name + " " + students[i].kor + " " + students[i].eng + " " + students[i].math);
        }
    }
}