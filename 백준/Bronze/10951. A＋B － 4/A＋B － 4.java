import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        String str = "";

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (0 < A && B < 10) {
                bw.write(A + B + "\n");
            }
            else System.out.println("1이상의 숫자와 9이하의 숫자를 입력해주세요");
        }

        bw.flush();
        bw.close();
    }
}