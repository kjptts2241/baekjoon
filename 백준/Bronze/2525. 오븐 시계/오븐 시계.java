import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A, B, C;

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(br.readLine());

        int hour;

        if (0 <= A && A <= 23 && 0 <= B && B <= 59 && 0 <= C && C <= 1000) {
            if (B + C <= 59) B += C;
            else {
                hour = (B+C)/60;

                if (A == 23) {
                    A = -1;
                    A += hour;
                }
                else if (23 < A + hour) A = (A + hour)-24;
                else A += hour;

                B = (B+C)%60;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(A + " " + B + "\n");

        bw.flush();
        bw.close();
    }
}