import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int N = 0, M = 0;

        // 바구니 갯수와 역순 할 횟수 입력
        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            
            if (1 <= N && N <= 100 && 1 <= M && M <= 100) break;
            else System.out.println("1 이상 100 이하의 두 숫자를 입려해주세요");
        }

        // 바구니 생성
        int[] baskets = new int[N];

        // 바구니에 번호 넣기
        for (int i = 0; i < N; i++) {
            baskets[i] = i+1;
        }

        // int 배열 -> List 변환
        List<Integer> intList
                = Arrays.stream(baskets)
                    .boxed()
                    .collect(Collectors.toList());

        // M번 만큼 입력한 부분까지 역순
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            // 부분 역순
            Collections.reverse(intList.subList(start-1, end));
        }

        for (int basket : intList) {
            bw.write(basket + " ");
        }

        bw.flush();
        bw.close();
    }
}