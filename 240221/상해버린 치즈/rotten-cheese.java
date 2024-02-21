import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        // 치즈를 먹은 기록 저장
        List<int[]> records = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            st = new StringTokenizer(br.readLine());
            int person = Integer.parseInt(st.nextToken());
            int cheese = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            records.add(new int[]{person, cheese, time});
        }

        // 아픈 사람과 아프기 시작한 시간 저장
        Map<Integer, Integer> sickTimes = new HashMap<>();
        for (int i = 0; i < S; i++) {
            st = new StringTokenizer(br.readLine());
            int person = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            sickTimes.put(person, time);
        }

        // 상한 치즈 후보 찾기
        Set<Integer> possibleSpoiledCheese = new HashSet<>();
        for (int i = 1; i <= M; i++) {
            possibleSpoiledCheese.add(i);
        }
        
        for (Map.Entry<Integer, Integer> entry : sickTimes.entrySet()) {
            int person = entry.getKey();
            int sickTime = entry.getValue();
            Set<Integer> eatenCheese = new HashSet<>();
            for (int[] record : records) {
                if (record[0] == person && record[2] < sickTime) {
                    eatenCheese.add(record[1]);
                }
            }
            possibleSpoiledCheese.retainAll(eatenCheese);
        }

        // 상한 치즈를 먹은 모든 사람 세기
        Set<Integer> sickPeople = new HashSet<>();
        for (int spoiledCheese : possibleSpoiledCheese) {
            for (int[] record : records) {
                if (record[1] == spoiledCheese) {
                    sickPeople.add(record[0]);
                }
            }
        }

        // 필요한 약의 최대 개수 출력
        System.out.println(sickPeople.size());
    }
}