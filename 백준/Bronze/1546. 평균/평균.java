import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N;
        
        // 시험 본 과목의 개수 입력
        while(true) {
            N = Integer.parseInt(br.readLine());
            
            if (N <= 1000) break;
            else System.out.println("1000 이하의 숫자를 입력해주세요");
        }
        
        // 성적 배열 생성
        double[] scores = new double[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 성적 입력
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        // 최댓값 구하기
        double max = Arrays.stream(scores).max().getAsDouble();

        // 모든 점수를 점수/max*100 으로 수정
        for (int i = 0; i < N; i++) {
            scores[i] = scores[i]/max*100;
        }

        // 평균 구하기 (리턴 값이 없을 경우 null 대신 0을 리턴)
        double average = Arrays.stream(scores).average().orElse(0);

        bw.write(average + "\n");

        bw.flush();
        bw.close();
    }
}