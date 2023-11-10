import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String str = br.readLine(); // 문자 입력
            
            if (str == null || str.isEmpty()) break; // EOF 만나면 break
            sb.append(str).append("\n"); // 아니라면 sb에 저장
        }
        
        // 출력
        bw.write(sb + "\n");

        bw.flush();
        bw.close();
    }
}