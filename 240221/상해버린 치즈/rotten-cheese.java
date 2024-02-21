import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class Point implements Comparable<Point> {
        int number;
        int cheese;
        int time;

        private Point(int number, int cheese, int time) {
            this.number = number;
            this.cheese = cheese;
            this.time = time;
        }

        @Override
        public int compareTo(Point o) {
            return this.time - o.time;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "number=" + number +
                    ", cheese=" + cheese +
                    ", time=" + time +
                    '}';
        }
    }


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        // 사람의 수
        int N = Integer.parseInt(st.nextToken());
        // 치즈의 수
        int M = Integer.parseInt(st.nextToken());
        // 테케 수
        int D = Integer.parseInt(st.nextToken());
        // 아픈 사람 테케 수
        int S = Integer.parseInt(st.nextToken());

        // 아플 사람 담기?
        int sickHuman[] = new int[N + 1];
        // 상한 치즈 담기.
        int rotCheese[] = new int[M + 1];

        //언제 누가 무슨치즈 먹었는지?
        Point arr[] = new Point[D];

        for (int i = 0; i < D; i++) {
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            int cheese = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());

            arr[i] = new Point(number, cheese, time);
        }

        int medicine = 0;

        //아픈 사람 조사

        int numberHuman[] = new int[N + 1];
        List<Point> eatTime = new ArrayList<>();

        for (int i = 0; i < S; i++) {
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            //time 전에 number 인 사람이 먹은 치즈 rotCheese 에 담자.
            //D만큼 다시 조사
            for (int j = 0; j < D; j++) {
                //1초 후에 아프다고 했으니 범위는 <
                //number 가 같을 때
                if (number == arr[j].number) {
                    //아픈 시간 1초 전에 먹은 치즈 상했을 확률 올리기
                    if (arr[j].time < time) {
//                        System.out.println(arr[j].toString());
                        numberHuman[arr[j].number] = 1;
                        eatTime.add(new Point(number, arr[j].cheese, time));
                    }
                }
            }
        }

        int numberCnt = 0;
        for (int i = 0; i < numberHuman.length; i++) {
            numberCnt += numberHuman[i];
        }

//        System.out.println(Arrays.toString(rotCheese));

        if (numberCnt != 1) {
            for (int i = 0; i < eatTime.size(); i++) {

                boolean flags = false;
                for (int j = 0; j < eatTime.size(); j++) {

                    if (eatTime.get(i).number != eatTime.get(j).number) {
                        if (eatTime.get(i).cheese == eatTime.get(j).cheese) {
                            flags = true;
                        }
                    }
                }
                if (flags) {
                    rotCheese[eatTime.get(i).cheese] = 1;
                }
            }
        }else{
            for (int i = 0; i < eatTime.size(); i++){
                rotCheese[eatTime.get(i).cheese] = 1;
            }
        }

        // 상한 치즈 유추가 끝나면
        // 그 치즈를 먹은 사람 골라야함

        for (int i = 0; i < D; i++) {
            for (int j = 0; j < rotCheese.length; j++) {
                //i번째 사람이 그 치즈를 먹었다면 아플 수 있음.
                if (rotCheese[j] == 1) {
                    if (arr[i].cheese == j) {
                        sickHuman[arr[i].number] = 1;
                    }
                }

            }
        }

//        System.out.println(Arrays.toString(sickHuman));


        // 체크

        for (int i = 0; i < sickHuman.length; i++) {
            if (sickHuman[i] == 1) {
                medicine++;
            }
        }

        sb.append(medicine);


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}