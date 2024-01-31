import java.io.*;

import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static ArrayList<String> checking = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        //문자열 개수
        int N = Integer.parseInt(st.nextToken());
        //몇 번째인지
        int K = Integer.parseInt(st.nextToken());
        //시작 문자열
        String str = st.nextToken();

        //문자열 담을 배열
        String strArr[] = new String[N];

        //문자열 담기
        for(int i = 0; i < N; i++){
            strArr[i] = br.readLine();
        }

        //해당 문자열로 시작하는지 체크해서 리스트에 담기
        valid(str, strArr);

        //리스트 정렬
        Collections.sort(checking);
        
        //k번째 원소 뽑기
        sb.append(checking.get(K-1));


        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void valid(String str, String[] arr) {

        int len = str.length();

        for(int i = 0; i < arr.length; i++){
            boolean flags = true;
            for(int j = 0; j < len; j++){
                if(arr[i].charAt(j) != str.charAt(j)){
                    flags = false;
                    break;
                }
            }
            if(flags){
                checking.add(arr[i]);
            }
        }
    }


}