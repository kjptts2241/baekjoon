import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score;
        score = Integer.parseInt(br.readLine());


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if (90 <= score && score <= 100) bw.write("A" + "\n");
        else if (80 <= score && score <= 89) bw.write("B" + "\n");
        else if (70 <= score && score <= 79) bw.write("C" + "\n");
        else if (60 <= score && score <= 69) bw.write("D" + "\n");
        else bw.write("F" + "\n");

        bw.flush();
        bw.close();
    }
}
